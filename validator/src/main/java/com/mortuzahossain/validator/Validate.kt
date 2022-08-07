package com.mortuzahossain.validator

object Validate {
    @JvmStatic
    fun String.isValidPhoneNumber(): Boolean {
        val regexPattern = "^[+880|0][1][1|3|4|5|6|7|8|9][0-9]{8}$"
        return this.replace("-", "").replace(" ", "").matches(Regex(regexPattern))
    }

    @JvmStatic
    fun String.getOperatorName(): MobileOperator {
        if (!this.isValidPhoneNumber()) return MobileOperator.InValid
        else {
            val number = this.replace("+880", "0").replace(" ", "").replace("-", "")
            if (number.startsWith("011")) return MobileOperator.CityCell
            else if (number.startsWith("013") || number.startsWith("017")) return MobileOperator.GrameenPhone
            else if (number.startsWith("014") || number.startsWith("019")) return MobileOperator.Banglalink
            else if (number.startsWith("015")) return MobileOperator.TeleTalk
            else if (number.startsWith("016") || number.startsWith("018")) return MobileOperator.Robi
        }
        return MobileOperator.InValid
    }
}
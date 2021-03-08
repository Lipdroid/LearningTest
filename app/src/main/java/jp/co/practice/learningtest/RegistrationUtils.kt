package jp.co.practice.learningtest

object RegistrationUtils {
    private var listofExistingEmails = listOf("Munir","Sadia")
    /**
     * ...empty email will return false
     * ...email already exists will return false
     * ...different password and confirmpassword will return false
     * ...password less than two digits will return false
     * */
    fun isInputValid(email: String, password: String, confirmPassword: String): Boolean {
        if(email.isEmpty() || password.isEmpty()){
            return false
        }
        if(email in listofExistingEmails){
            return false
        }
        if (password != confirmPassword){
            return false
        }
        if (password.count {it.isDigit()}<2){
            return false
        }
        return true
    }
}
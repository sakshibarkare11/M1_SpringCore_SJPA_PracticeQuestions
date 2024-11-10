import java.util.regex.Pattern;

public class AccountLinkingSystem {
	public String validateAccountDetails(String accountNumber, String aadharNumber, String panNumber)
			throws InvalidAccountDetailsException {

		// Fill the code here

		if (accountNumber.length() != 10) {
			throw new InvalidAccountDetailsException("Invalid Account number");

		}
		if (aadharNumber.length() != 12) {
			throw new InvalidAccountDetailsException("Invalid Aadhar number");
		}
//		if (panNumber.length() != 10) {
//			throw new InvalidAccountDetailsException("Invalid PAN number");
//		}
		if (!Pattern.matches("^[A-Z]{5}[0-9]{4}//d[A-Z]{1}$", panNumber)) {
			
			throw new InvalidAccountDetailsException("Invalid PAN number");

		}

		return "Linking Successful for the account: " + accountNumber + aadharNumber + panNumber;
	}
}

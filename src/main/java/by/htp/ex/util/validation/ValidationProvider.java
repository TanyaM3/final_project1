package by.htp.ex.util.validation;

public final class ValidationProvider {
	private static final ValidationProvider instance = new ValidationProvider();
	private LoginationValidatorImpl loginationValidator = new LoginationValidatorImpl();
	private RegistrationValidatorImpl registrationValidator = new RegistrationValidatorImpl();

	private ValidationProvider() {

	}

	public static ValidationProvider getInstance() {
		return instance;
	}

	public LoginationValidatorImpl getLoginationValidator() {
		return loginationValidator;
	}

	public RegistrationValidatorImpl getRegistrationValidator() {
		return registrationValidator;
	}

}
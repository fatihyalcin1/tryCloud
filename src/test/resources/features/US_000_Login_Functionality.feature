@B32G3-133
Feature: Default

	
	@B32G3-126
	Scenario: Login
		When User can login with valid credentials
		#(either clicking on the "Login button" or hitting  the "Enter" key from the keyboard as the last step)	

	
	@B32G3-127
	Scenario Outline: User cannot login
		When User cannot login with any invalid credentials "<username>" "<password>"
		When `Wrong username or password.` should be displayed for invalid credentials
		Examples:
		      | username | password |
		      | asdf1    | asdf1    |
		      | asdf2    | asdf2    |
		      | asdf3    | asdf3    |	

	
	@B32G3-128
	Scenario: see the password in a form of dots by default
		When User can see the password in a form of dots by default	

	
	@B32G3-129
	Scenario: see the password explicitly
		When User can see the password explicitly if needed	

	
	@B32G3-130
	Scenario: see Forgot password?
		When User can see the `Forgot password?` link on the login page	

	
	@B32G3-131
	Scenario: see Reset Password
		And User can see the `Reset Password` button after clicking on forget password link	

	
	@B32G3-132
	Scenario: see valid placeholders
		When User can see valid placeholders on Username and Password fields
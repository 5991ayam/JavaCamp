package nLayeredCommerce.business.concretes;

import nLayeredCommerce.business.abstracts.AuthorizaionService;
import nLayeredCommerce.entities.concretes.UserAccount;
import nLayeredCommerce.googlePackage.GoogleSignUpManager;

public class AuthorizaionManager implements AuthorizaionService {

	private GoogleSignUpManager signUpService;
	
	public AuthorizaionManager(GoogleSignUpManager signUpService) {
		this.signUpService = signUpService;
	}

	@Override
	public boolean Login(UserAccount userAccount) {
		
		return signUpService.login(userAccount.getEmail());
		
	}

	@Override
	public void LogOut(UserAccount userAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Register(UserAccount userAccount) {
		// TODO Auto-generated method stub
		
	}

}

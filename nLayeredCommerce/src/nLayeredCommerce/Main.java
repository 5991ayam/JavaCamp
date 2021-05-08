package nLayeredCommerce;

import nLayeredCommerce.business.abstracts.AuthorizaionService;
import nLayeredCommerce.business.concretes.AuthorizaionManager;
import nLayeredCommerce.entities.concretes.UserAccount;
import nLayeredCommerce.googlePackage.GoogleSignUpManager;

public class Main {

	public static void main(String[] args) {
		
		UserAccount userAccount = new UserAccount(1, "ahmet", "yaman", "yaman2222@gmail.com", "1234") {};
		
		AuthorizaionService authService= new AuthorizaionManager(new GoogleSignUpManager());
		authService.Login(userAccount);
		


	}

}

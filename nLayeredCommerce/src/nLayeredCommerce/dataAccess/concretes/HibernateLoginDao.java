package nLayeredCommerce.dataAccess.concretes;

import java.util.ArrayList;

import nLayeredCommerce.dataAccess.abstracts.LoginDao;
import nLayeredCommerce.entities.concretes.UserAccount;

public class HibernateLoginDao  implements LoginDao{

	@Override
	public boolean Login(UserAccount userAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void LogOut(UserAccount userAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean AddUserAccount(UserAccount userAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoveUserAccount(UserAccount userAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<UserAccount> getUserAccountAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

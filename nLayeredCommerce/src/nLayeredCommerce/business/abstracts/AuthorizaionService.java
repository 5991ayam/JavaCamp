package nLayeredCommerce.business.abstracts;

import nLayeredCommerce.entities.concretes.UserAccount;

public interface AuthorizaionService {
	public boolean Login(UserAccount userAccount);
    public void LogOut(UserAccount userAccount);
    public void Register(UserAccount userAccount);
	
}

package nLayeredCommerce.dataAccess.abstracts;

import java.util.ArrayList;

import nLayeredCommerce.entities.concretes.UserAccount;


public interface LoginDao {

public  boolean Login(UserAccount userAccount);

public void LogOut(UserAccount userAccount);

public boolean AddUserAccount(UserAccount userAccount);

public boolean RemoveUserAccount(UserAccount userAccount);

public ArrayList<UserAccount> getUserAccountAll();



}


public class CustomerManager {

	 ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal){
		this.customerDal=customerDal;
	}
	
	public void Add() {
		customerDal.Add();
		//is kodlari
	}
	
}

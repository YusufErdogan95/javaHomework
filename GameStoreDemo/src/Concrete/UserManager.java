package Concrete;

import java.rmi.RemoteException;

import Abstracts.UserService;
import Adapters.MernisCheckService;
import Entities.User;

public class UserManager implements UserService {

	public UserManager(MernisCheckService mernisCheckService) {
		
	}

	

	@Override
	public void add(User user) throws NumberFormatException, RemoteException {
		System.out.println("Kullanýcý Eklendi:"+user.getFirstName()+user.getUserid());
		
	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException {
		System.out.println("Kullanýcý güncellendi:"+user.getFirstName()+user.getUserid());
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException {
		System.out.println("Kullanýcý silindi:"+user.getFirstName()+user.getUserid());
		
	}

}

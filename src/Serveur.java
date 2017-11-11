import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.*;

import java.rmi.server.*;


public class Serveur extends UnicastRemoteObject implements Interface {

	

// constructeur par d�faut
public Serveur() throws RemoteException {

super(); }

///

//la m�thode getnom : retourne le nom de la machine sur le r�seau 
public String getnom() throws RemoteException, UnknownHostException{

	InetAddress address = InetAddress.getLocalHost();
	
	return address.getHostName();
}


//la m�thode getip : retourne l'@ip d'un �quipement

public  String getip() throws RemoteException, UnknownHostException{
	InetAddress address = InetAddress.getLocalHost();
	
return address.getHostAddress();
	
}	
	
	
// la m�thode getmac : retourne l'@mac d'un �quipement
	
public String getmac() throws RemoteException, UnknownHostException{
	
	 InetAddress address = InetAddress.getLoopbackAddress();
	 
	 return address.getHostAddress();
}
	
// la m�thode getram : retourne l'utilisation de la ram d'un �quipement

public String getram(){
	InetAddress address = InetAddress.getByName(getnom());
	
	return address.;
}
	
// la m�thode getprocesseur : retourne l'utilisation du processeur d'un �quipement
public String getprocesseur(){

	return " ";
}
	


///













public static void main(String[] args) {

try {

Serveur objet = new Serveur();

Naming.rebind("rmi://localhost/Serveur", objet);

System.out.println("Serveur pr�t");

}

catch(Exception e) {

System.err.println("Erreur: " + e.getMessage());

}

}

}


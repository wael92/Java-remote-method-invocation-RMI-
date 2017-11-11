import java.net.UnknownHostException;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Interface extends Remote {

//la m�thode getnom : retourne le nom de la machine sur le r�seau 
	public String getnom()throws RemoteException, UnknownHostException;
	
// la m�thode getip : retourne l'@ip d'un �quipement

public String   getip() throws RemoteException, UnknownHostException;	
	
	
// la m�thode getmac : retourne l'@mac d'un �quipement
	
public String getmac()throws RemoteException, UnknownHostException;
	
// la m�thode getram : retourne l'utilisation de la ram d'un �quipement

public String getram()throws RemoteException, UnknownHostException;
	
// la m�thode getprocesseur : retourne l'utilisation du processeur d'un �quipement
public String getprocesseur()throws RemoteException, UnknownHostException;
	
//public void addition()

}
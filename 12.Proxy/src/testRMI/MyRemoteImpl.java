package testRMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) throws RemoteException {
        // Please, start rmiregistry in your JAVA_HOME directory from directory with generated class files
        System.out.println("RMI server started");
        try {
            MyRemote server = new MyRemoteImpl();
            Naming.rebind("RemoteHello", server);
            System.out.println("PeerServer bound in registry");
        } catch (Exception e) {
            System.err.println("RMI server exception:" + e);
            e.printStackTrace();
        }
    }
}




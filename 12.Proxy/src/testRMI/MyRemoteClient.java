package testRMI;

import java.rmi.Naming;

public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().getMessage();
    }

    public void getMessage() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("RemoteHello");
            System.out.println(service.sayHello());
        } catch (Exception e) {
            System.err.println("RmiClient exception: " + e);
            e.printStackTrace();
        }
    }
}
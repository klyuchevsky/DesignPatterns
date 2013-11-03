package machineRemote;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {
                "rmi://127.0.0.1/gumballmachine"
        };

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(gumballMachineRemote);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}

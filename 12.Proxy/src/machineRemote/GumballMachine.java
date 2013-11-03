package machineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state = soldOutState;
    int count = 0;


    public GumballMachine(int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public GumballMachine(String location, int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getWinnerState() {
        return winnerState;
    }

    State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        return ("\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: " + count + " gumballs\n");
    }
}
package machine;

interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
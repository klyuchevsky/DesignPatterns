import command.Command;
import command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    int countButtons = 9;

    public RemoteControl() {
        onCommands = new Command[countButtons];
        offCommands = new Command[countButtons];
        Command noCommand = new NoCommand();
        for (int i = 0; i < countButtons; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------- Remote Control ---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuilder.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
        stringBuilder.append("----------------------------------");
        return stringBuilder.toString();
    }
}

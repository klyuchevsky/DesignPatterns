import command.*;
import objects.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");
        CeilingFan ceilingFan = new CeilingFan("ceiling fan in living room");
        GarageDoor garageDoor = new GarageDoor("garage door");
        Stereo stereo = new Stereo("stereo in living room");
        Hottub hottub = new Hottub("");
        TV tv = new TV("living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = {livingRoomLightOn, stereoOnWithCDCommand, tvOnCommand, hottubOnCommand};
        Command[] partyOff = {livingRoomLightOff, stereoOffCommand, tvOffCommand, hottubOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(4, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(6, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(7, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        System.out.println("Cancel stereo off:");
        remoteControl.undoCommand.undo();
        System.out.println(remoteControl);
        System.out.println("\n--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(7);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(7);
    }
}

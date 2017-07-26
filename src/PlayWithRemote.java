import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args){

        ElectronicDevice newDevice = TVRomote.getDevice();

        //turn on TV
        TurnTVOn onCommand = new TurnTVOn(newDevice);

        DeviceButton onPress = new DeviceButton(onCommand);

        onPress.press();
        // Turn TV off

        TurnTVOff offCommand = new TurnTVOff(newDevice);
        DeviceButton offButton = new DeviceButton(offCommand);
        offButton.press();

        //turn volume up

        TurnTVUp upCommand = new TurnTVUp(newDevice);
        DeviceButton upButton = new DeviceButton(upCommand);
        upButton.press();
        upButton.press();

        // Shut down all the devices

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allTheDevices = new ArrayList<ElectronicDevice>();

        allTheDevices.add(theTV);
        allTheDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allTheDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();


    }
}

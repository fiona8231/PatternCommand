import java.util.List;

public class TurnItAllOff implements Command{


    List<ElectronicDevice> allDevices;

    //constructor
    public TurnItAllOff(List<ElectronicDevice> newDevices){

        allDevices = newDevices;
    }


    @Override
    public void execute() {

        for (ElectronicDevice counter: allDevices){

            counter.off();

        }
    }
}

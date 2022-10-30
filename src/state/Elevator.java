package state;

public class Elevator {
    public static int current_Floor = 5;
    int dest_Floor;
    private Elv_States State = new Elv_States();

    public Elevator(int dest_floor) {
        this.dest_Floor = dest_floor;
        System.out.println("*** Destination floor is: " + this.dest_Floor);
        this.arrive_atFloor();
    }


    private void arrive_atFloor() {
        if(current_Floor > dest_Floor){
            State.Current_State = State.Moving_down;
            current_Floor = current_Floor-1;
            System.out.println("*** Current floor is: " + current_Floor);
            arrive_atFloor();

        }else if (current_Floor < dest_Floor){
            State.Current_State = State.Moving_up;
            current_Floor = current_Floor+1;
            System.out.println("*** Current floor is: " + current_Floor);
            arrive_atFloor();
        }else{
            State.Current_State = State.Idle;
            System.out.println("*** You arrived at your destination");
        }



    }
}
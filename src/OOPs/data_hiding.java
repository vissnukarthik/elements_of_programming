package OOPs;
import java.util.Scanner;

class stdudent{
    private String name;
    private int roll_num;

    public void setName(String name){
        this.name = name;
    }
    public void setRoll_num(int roll_num){
        this.roll_num = roll_num;
    }

    public String getName(){
        return name;
    }
    public int getRoll_num(){
        return roll_num;
    }

}

public class data_hiding {

    public static void main(String[] args) {
        stdudent std = new stdudent();

        Scanner in = new Scanner(System.in);
        std.setName(in.nextLine());
        std.setRoll_num(290);
        System.out.println(std.getName() + " : " + std.getRoll_num());
    }


}

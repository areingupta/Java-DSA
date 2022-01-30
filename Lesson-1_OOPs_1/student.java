package classes_and_objects;

public class student {

    public String name;
    private final int rollNumber;

    private static int num_students;

//    public student(){
//        // This is default constructor
//    }

    public student(String name , int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        num_students++;
    }

    public static int getNum_students(){
        return num_students;
    }

//    public void setRollNumber(int rn){
//        if (rn <= 0){
//            return;
//        }
//        rollNumber = rn;
//    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void print(){
        System.out.println(name + ": " + rollNumber);
    }

}

package view;
import model.GroupOfStudents;
import model.Student;

public class View {
    public static final String ENTER_NUMBER = "Enter your number";
    public static final String ENTER_STUD = "Enter student's name or surname";
    public static final String WRONG_INPUT = "Wrong input! Try again";
    public static final String INT_IS_OUT_OF_BOUNDS = "Your number is out of bounds";
    public static final String EMPTY_DATA = "No results found for this criteria";
    public static final String YES_OR_NO = "Enter 1 if yes and 2 if no";
    public Student[] group;
    public View(Student[] group){
        this.group=group;
    }
    public void showMenu(){
        System.out.println("Press:\n1 - to show all students\n2 - to show students whose grade is better than (number)\n3 - to show list of exams of specifical student\n4 - to exit");
    }
    public void showMessage(String message){
        System.out.println(message);
    }
    public void showAll(){
        System.out.println("Name \t Surname \t Patronymic \t Number \t Course \t Mark \t Subject 1 \t Subject 2 \t Subject 3");
        for(int i=0; i<group.length; i++) System.out.println(group[i]);
    }
    public void showResult(Student[] res){
        //if(res.length == 0) System.out.println(EMPTY_DATA);
        try {
            Validator.validStud(res);
            for (Student re : res) System.out.println(re);
        }catch (IllegalArgumentException e){
            System.out.println(EMPTY_DATA);
        }
    }


}

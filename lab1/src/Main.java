import controller.*;
import view.View;
import model.GroupOfStudents;
import model.FileHandler;

public class Main {

    public static void main(String[] args) {
        //Controller controller = new Controller(new GroupOfStudents().group);
        Controller controller = new Controller(FileHandler.GetFromFile("Students.txt"));
        controller.Start();
    }
}

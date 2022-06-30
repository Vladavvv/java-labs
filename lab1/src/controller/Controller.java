package controller;
import model.*;
import view.*;

public class Controller {
    public Student[] group;
    public Model model;
    public View view;
    public InputUtil u;
    public Controller(Student[] group){
        this.group = group;
        model = new Model(group);
        view = new View(group);
        u = new InputUtil(view);
    }
    public void Start(){

        boolean exit = true;
        while (exit){
            view.showMenu();
            int numb = u.inputIntValue();
            switch (numb){
                case 1 : view.showAll();
                break;
                case 2 :
                    Student[] res = model.findStudent(u.inputIntValue());
                view.showResult(res);
                if(u.inputIntValue2() == 1){
                    FileHandler.Saving(res);
                    System.out.println("Your result is saved");
                }
                break;
                case 3 :
                    Student[] res1 = model.findStudent(u.inputStringValue());
                    view.showResult(res1);
                    if(u.inputIntValue2() == 1){
                        FileHandler.Saving(res1);
                        System.out.println("Your result is saved");
                    }
                    //System.out.println(u.inputStringValue());
                    break;
                case 4 : exit = false;
                break;

            }

        }
    }



}



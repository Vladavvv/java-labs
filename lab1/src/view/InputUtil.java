package view;

import model.Student;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    public View view;
    public Scanner sc;
    public InputUtil(View view){
        this.view = view;
        sc = new Scanner(System.in);
    }
    public int inputIntValue(){
        view.showMessage(View.ENTER_NUMBER);
        return Validator.validNumb(sc, view, 1, 4);
//        while(!sc.hasNextInt()){
//            view.showMessage(View.WRONG_INPUT);
//            sc.next();
//        }
//        return sc.nextInt();
    }

    public int inputIntValue2(){
        view.showMessage("Do you want to save result?");
        view.showMessage(View.YES_OR_NO);
        return Validator.validNumb(sc, view, 1, 2);
    }

    public String inputStringValue(){
        view.showMessage(View.ENTER_STUD);
        sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

class Validator{
    static int validNumb(Scanner sc, View view, int start, int end){
        int x;
        while (true) {
            try {
                //if(!sc.hasNextInt())throw new IOException();
                x = sc.nextInt();
                if(x > end || x < start)throw new IllegalArgumentException();
                return x;
            } catch (InputMismatchException e) {
                view.showMessage(View.WRONG_INPUT);
                sc.next();
            }
            catch (IllegalArgumentException e){
                view.showMessage(View.INT_IS_OUT_OF_BOUNDS);
                //sc.next();
            }
        }
    }

    static void validStud(Student[] s){
        if(s.length == 0) throw new IllegalArgumentException();
    }


}
package model;

import java.util.Arrays;

public class Model {
    public Student[] group;
    public Model(Student[] group){
        this.group=group;
    }
    public Student[] findStudent(int n){
        int counter = 0;
        int[] preres = new int[group.length];
        for (Student stud: group) {
            if(stud.getMark() > n){
                preres[counter] = Arrays.asList(group).indexOf(stud);
                counter++;}

        }
        Student[] res = new Student[counter];
        for(int i = 0; i < counter; i++){
            res[i] = group[preres[i]];
        }
        return res;
    }

    public Student[] findStudent(String n){
        int counter = 0;
        int[] preres = new int[group.length];
        for (Student stud: group) {
            if(stud.getName().equals(n) || stud.getSurname().equals(n)){
                preres[counter] = Arrays.asList(group).indexOf(stud);
                counter++;}

        }
        Student[] res = new Student[counter];
        for(int i = 0; i < counter; i++){
            res[i] = group[preres[i]];
        }
        return res;
    }

}


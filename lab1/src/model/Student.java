package model;

public class Student {
    private String name, surname, patronymic;
    private int number, course, mark;
    private String[] subj = new String[3];
    public Student(String name, String surname, String patronymic, int number, int course, int mark, String subj1, String subj2, String subj3){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.number = number;
        this.course = course;
        this.mark = mark;
        subj[0] = subj1;
        subj[1] = subj2;
        subj[2] = subj3;
    }

    public int getCourse() {
        return course;
    }

    public int getMark() {
        return mark;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String[] getSubj() {
        return subj;
    }

    @Override
    public String toString() {
        return name + " \t " + surname + " \t " + patronymic + " \t " + number + " \t " + course + " \t " + mark + " \t " + subj[0] + " \t "  + subj[1] + " \t " + subj[2];
    }
}

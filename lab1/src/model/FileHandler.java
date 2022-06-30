package model;

import java.io.*;

public class FileHandler {
    public static Student[] GetFromFile(String fileName){
        File file = new File(fileName);
        Student[] res = new Student[10];
        BufferedReader br = null;
        try {
             br = new BufferedReader(new FileReader(file.getName()));
            String line;

            for(int i = 0; i < res.length; i++){
                line = br.readLine();
                String[] s = line.split(" ");
                res[i] = new Student(s[0], s[1], s[2], Integer.parseInt(s[3]), Integer.parseInt(s[4]), Integer.parseInt(s[5]), s[6], s[7], s[8]);

            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }
        return res;
    }

    public static void Saving(Student[] res){
        File file = new File("Result.txt");
        FileWriter pw = null;

        try{
            if(!file.exists())file.createNewFile();
            pw = new FileWriter(file, true);
            for (Student s: res) {
                pw.write(s.toString() + "\n");
            }
            pw.write("\n");

            }catch (IOException e ){
            System.out.println(e);
            }finally {
            try {
                pw.close();
            }catch (IOException e){
                System.out.println(e);
            }
            }
    }




}

package natashadihtiar;

public class Main {

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom("Jack", "John", "Peter", "Liza");

        Pupil pupil1 = classRoom.getPupil1();
        System.out.println(pupil1);
        Pupil pupil2 = classRoom.getPupil2();
        System.out.println(pupil2);
        Pupil pupil3 = classRoom.getPupil3();
        System.out.println(pupil3);
        Pupil pupil4 = classRoom.getPupil4();
        System.out.println(pupil4);
}}

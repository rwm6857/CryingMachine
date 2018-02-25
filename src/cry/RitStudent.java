package cry;

import java.util.Scanner;

public class RitStudent {
    private String name;

    public enum majors {
        SWEN, CS, CSEC, MATH, LIBARTS, GAMEDEV, ART, SOFA
    }

    private RitStudent.majors major;

    private boolean willToLive;

    public RitStudent(String name, RitStudent.majors major) {
        this.name = name;
        this.major = major;
        if (this.major == majors.LIBARTS || this.major == majors.GAMEDEV || this.major == majors.ART) {
            this.willToLive = true;
        } else {
            this.willToLive = false;
        }
    }

    @Override
    public String toString() {
        String s1 = "Hey " + this.name + ". We see that you're a " + this.major + ". ";
        if (this.willToLive) {
            String s2 = "Because of this, you have no reason to cry!";
            return s1 + s2;
        }
        return s1 + "Because of this, we know you need to cry...";

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = reader.next();
        System.out.println("What's your major? ");
        RitStudent.majors major = RitStudent.majors.valueOf(reader.next().toUpperCase());
        reader.close();
        RitStudent crier = new RitStudent(name, major);

        System.out.println(crier);
        if (crier.willToLive) {
            System.exit(0);
        }
        System.out.println("~You begin crying eternally~");

    }
}

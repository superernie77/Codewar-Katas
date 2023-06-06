package main.java.katas;

public class CatJump {

    public static int solution(int start, int finish) {
        int delta = finish-start;
        int threes = delta/3;
        int rest = delta-threes*3;
        return threes+rest;
    }
}

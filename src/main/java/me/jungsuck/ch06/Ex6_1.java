package me.jungsuck.ch06;

public class Ex6_1 {
    public static void main(String args[]) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        t.channelDown();
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

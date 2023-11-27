package org.example.strategy;

public enum Hand {

    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보",2);

    private String name;
    private int handValue;

    private static Hand[] hands = {
        ROCK,SCISSORS,PAPER
    };

    //생성자
    private Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    //손의 값으로 enum 상수를 가져온다
    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    // this가 h보다 강할때 true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == 1;
    }

    //무승부는 0, this가 이기면 1, h가 이기면 -1
    private int fight(Hand h) {
        if(this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }
    
    // 가위바위보의 문자열 표현
    @Override
    public String toString() {
        return name;
    }


}

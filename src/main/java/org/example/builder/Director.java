package org.example.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //문서를 만드는 메소드
    public void construct() {
        builder.makeTitle("안녕하세요.");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[]{
                "How are you?",
                "Hello",
                "Hi"
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[] {"Good Morning", "Good Afternoon", "Good Evening"});

        builder.close();
    }
}

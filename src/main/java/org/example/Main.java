package org.example;

import org.example.builder.Director;
import org.example.builder.HTMLBuilder;
import org.example.builder.TextBuilder;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            usage();
            System.exit(0); //exit : 강제 JVM 종료 --> 0 : 정상종료
        }

        if(args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getTextResult();
            System.out.println(result);
        } else if(args[0].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getHTMLResult();
            System.out.println(filename + "이 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text    텍스트로 문서작성");
        System.out.println("Usage: java Main html    HTML 파일로 문서작성");
    }
}
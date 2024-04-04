package com.ohgiraffers.section02.String;

public class Application4 {
    public static void main(String[] args) {

        /*이스케이프(escape) 문자에 대해 이해하고 적용할 수 있다. */
        /*
        * 이스케이프 문자란 ?
        * 문자열 내에서 사용하는 문자중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
        * 이스케이프문자       의미
        *      \n          개행(줄바꿈)
        *      \t          탭
        *      \'          작은따옴표
        *      \"          큰따옴표
        *      \\          역슬래시
        * */

        System.out.println(" 안녕하세요\n 저는 홍길동 입니다. ");

        System.out.println(" 안녕하세요\t 저는 홍길동 입니다. ");

        System.out.println(" 안녕하세요 저는 '홍길동' 입니다. ");
        //System.out.println('''');   //홀따옴표 문자와 리터럴 기호가 중복됨
        System.out.println('\'');
        //System.out.println(" 안녕하세요 저는 "홍길동" 입니다. ");  // 문자열 리터럴과 중복되어 에러남
        System.out.println(" 안녕하세요 저는 \"홍길동\" 입니다. ");

        //System.out.println(" 안녕하세요 저는 \홍길\동 입니다. ");    //역슬래시를 표현하고 싶지만 이스케이프 문자와 겹침
        System.out.println(" 안녕하세요 저는 \\홍길동\\ 입니다. ");


    }
}

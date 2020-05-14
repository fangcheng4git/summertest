package com.fangcheng.summertest.util;

import org.springframework.util.StopWatch;

/**
 * Stopwatch学习
 * @author fangcheng
 * @date 2020-05-14
 */
public class StopwatchTest {


    private static void springTest(){
        StopWatch stopWatch = new StopWatch("1");
        StopWatch stopWatch1 = new StopWatch("1");


        System.out.println(stopWatch.getId());
        System.out.println(stopWatch1.getId());
    }


    public static void main(String[] args) {
        springTest();
    }







}

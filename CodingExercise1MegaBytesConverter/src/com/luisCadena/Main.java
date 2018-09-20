package com.luisCadena;

public class Main {

    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(1025);
    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes) {

        System.out.println(kiloBytes + "KB = " + calculateMB(kiloBytes) + " MB and " + calculateRemainingKB(kiloBytes) + "KB");
    }


    private static int calculateMB(int kiloBytesToConvert ) {


        return kiloBytesToConvert/1024;

    }

    private static int calculateRemainingKB(int kiloBytesToConvert) {

        return kiloBytesToConvert%1024;

    }



}

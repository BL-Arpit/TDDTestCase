package org.example;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    LinkedList<Integer> a1 = new LinkedList<>();
    public boolean age(int a){
        return a >= 18;
    }

    public int add(int a , int b){
        return a+b;
    }

    public boolean phoneNumberChecker(String phoneNumber){
        return phoneNumber.matches("^[5-9][0-9]{9}");
    }

    public LinkedList<Integer> addItem(int i){
        a1.add(i);
        return a1;

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
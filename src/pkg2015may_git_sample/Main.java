/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2015may_git_sample;

/**
 *
 * @author kaori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main prin = new Main();
        prin.printer("Hello World");
    }
    
    public void printer(String message)
    {
        System.out.println("The message is " + message);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author irene
 */
public class TestUserprofile {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("there are 4 genre : Comedy Drama Action Mystery. select one");
        String inputGenre = sc.next();
        
        
        UserProfile profile = new UserProfile("ID12345", inputGenre); 
        
        System.out.println("userProfile was created");
       
    }
}

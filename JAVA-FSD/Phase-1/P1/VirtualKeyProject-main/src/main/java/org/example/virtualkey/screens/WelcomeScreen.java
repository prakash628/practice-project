package org.example.virtualkey.screens;

import org.example.virtualkey.services.DirectoryService;
import org.example.virtualkey.services.ScreenService;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class WelcomeScreen implements Screen {

    private String welcomeText = "Project : VirtualKey Project";
    private String developerText = "Developer Details: Garapati Prakash";
    private ArrayList<String> options = new ArrayList<>();


    public WelcomeScreen() {
        options.add("1. for getting the file list");
        options.add("2. for business operations");
        options.add("3. close the application");
    }
    
    public void introWS() {
    	System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("\n");
        Show();
    }
    
    @Override
    public void Show() {
    	System.out.println("Select Main Menu Option");
        for (String s : options)  {
            System.out.println(s);
        }
    }

    public void GetUserInput() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) > 0) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int menu) {
        switch(menu) {

            case 1: 
                this.ShowFiles();
                this.Show();
                break;
            case 2:
            	ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
                ScreenService.getCurrentScreen().Show();
                ScreenService.getCurrentScreen().GetUserInput();
                this.Show();
                break;
            case 3:
            	System.exit(menu);
            default:
                System.out.println("Invalid Option");
                break;
        }
        
    }

    public void ShowFiles() {
        System.out.println("List of Files: ");
    	DirectoryService.PrintFiles();
    }
    
    private int getOption() {
        Scanner input = new Scanner(System.in);
        int option = 0;
        try {
        	option = input.nextInt();
        }
        catch (InputMismatchException ex) {
            System.out.println("Invalid input");
        }
        return option;
    }
}

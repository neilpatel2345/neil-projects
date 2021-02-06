/*
Name: Neil Patel
Class: CSC142_80
Date:10/22/18
Homework:Lab 04
Statement of problem: Verifying the rows of a sudoku puzzle
 */
//package Lab4_ValidateSudokuPuzzle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Lab4_ValidateSudokuPuzzleClass 
{
//----------------------fields--------------------------------//
    ArrayList<Integer> checker = new ArrayList<Integer>();
    static int puzzle[][] = 
{
    {1,2,3, 4,5,6, 7,8,9},
    {4,5,6, 7,8,9, 1,2,3},
    {7,8,9, 1,2,3, 4,5,6},
   
    {2,3,4, 5,6,7, 8,9,1},
    {5,6,7, 8,9,1, 2,3,4},
    {8,9,1, 2,3,4, 5,6,7},
    
    {3,4,5, 6,7,8, 9,1,2},
    {6,7,8, 9,1,2, 3,4,5},
    {9,1,2, 3,4,5, 6,7,8}
};  
    boolean isValid = false;
    static int mainCounter=0;
    
    
//-----------Clone each row of the puzzle array to checker array---------//
    public void copier(int b)
    {
      int num =b;
        for(int i =0; i<9;i++)
        {
            checker.add(puzzle[num][i]);
        }  
    }//end of method

    
//---------Checks of multiple occurences of numbers----------//   
    public void comparer(int n) {
      int count=n;
      int c=0;
        for(int f=1;f<=9;f++) 
         { 
            if(Collections.frequency(checker, (f)) != 1)
             {
             }//end of if statement
            else
             {
                  c++;      
             }//end of else statment
         }//end of for loop
            
        if(c==9)
            {
                System.out.println("");
                System.out.println("CONGRATS!!!! Your saduko row #"+(count)+ " is correct"); 
                System.out.println("");
                mainCounter++;
            }
            else
            {
         //formatting
                System.out.print("[");
                for(int g= 0;g<9;g++)
                {
                    if(g != 8)
                    System.out.print(checker.get(g)+", ");
                    else
                        System.out.print(checker.get(g)+"");
                }//end of for loop
                System.out.print("]");
                System.out.println("");
                System.out.println("Your saduko row #"+(count)+" is incorrect");
                System.out.println("//------Missing number to meet requirement!--------//");
                System.out.println("");
            }
    }
 //-----------clears the clone Array-------------------//
    public void reset() 
    {
        checker.clear();
    }
 //-------------returns isValid as true or false depending on the correctness of the puzzle-----------//
    public static boolean valid() {
      boolean isValid=false;
            if(mainCounter==9)
            {
                isValid=true;
            }
    return isValid;
    }
    
 //----------------printing & formatting the 9x9 suduko puzzle---------------//
    public static void print() {
System.out.println("\t\tYour Sudoku Puzzle:\n");
        for(int h=0;h<9;h++)
        {
            System.out.print("[");
            for(int k=0;k<9;k++)
            {
                if(k!=8)
                    System.out.print(puzzle[h][k]+",");
                else
                    System.out.print(puzzle[h][k]);
                switch(k)
                {
                    case 2:
                        System.out.print("\t");
                      break;
                    case 5:
                        System.out.print("\t");
                      break;
                }//end of switch statement
            }//end of inside for loop
            System.out.println("]");
            switch(h)
                {
                    case 2:
                        System.out.print("\n");
                     break;
                    case 5:
                        System.out.print("\n");
                     break;
                }//end of switch statement
        }//end of outter for loop
    }//end of method
} //end of class

//NEW CLASS with main method
public class Lab4_ValidateSudokuPuzzle
{

    public static void main(String[] args) 
    {
//-------------------prints the 9x9 suduko puzzle-------------------//
Lab4_ValidateSudokuPuzzleClass.print();

//-------------------An object for each row------------------------//
Lab4_ValidateSudokuPuzzleClass user1 = new Lab4_ValidateSudokuPuzzleClass(); 
Lab4_ValidateSudokuPuzzleClass user2 = new Lab4_ValidateSudokuPuzzleClass();
Lab4_ValidateSudokuPuzzleClass user3 = new Lab4_ValidateSudokuPuzzleClass();
Lab4_ValidateSudokuPuzzleClass user4 = new Lab4_ValidateSudokuPuzzleClass();
Lab4_ValidateSudokuPuzzleClass user5 = new Lab4_ValidateSudokuPuzzleClass();
Lab4_ValidateSudokuPuzzleClass user6 = new Lab4_ValidateSudokuPuzzleClass();
Lab4_ValidateSudokuPuzzleClass user7 = new Lab4_ValidateSudokuPuzzleClass();
Lab4_ValidateSudokuPuzzleClass user8 = new Lab4_ValidateSudokuPuzzleClass();
Lab4_ValidateSudokuPuzzleClass user9 = new Lab4_ValidateSudokuPuzzleClass();
//-------------each object calls its own defined methods--------------//
user1.copier(0);  user1.comparer(1);  user1.reset(); 
user2.copier(1);  user2.comparer(2);  user2.reset(); 
user3.copier(2);  user3.comparer(3);  user3.reset(); 
user4.copier(3);  user4.comparer(4);  user4.reset(); 
user5.copier(4);  user5.comparer(5);  user5.reset(); 
user6.copier(5);  user6.comparer(6);  user6.reset(); 
user7.copier(6);  user7.comparer(7);  user7.reset(); 
user8.copier(7);  user8.comparer(8);  user8.reset(); 
user9.copier(8);  user9.comparer(9);  user9.reset();

//-----------checks if the puzzle if valid or not---------------//   
    if(Lab4_ValidateSudokuPuzzleClass.valid())
        {
            System.out.println("Your sudoku puzzle is valid");
        }//end of if statement
    else
            System.out.println("Your sudoku puzzle is invalid");
  
  } //end of main method
} //end of class

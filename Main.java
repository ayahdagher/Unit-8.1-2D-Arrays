import java.util.* ; 

class Main {
  public static void main(String[] args) {
  
    // creating and printing an empty 2d array 
    
     int [][] table = new int [4][3];
     for(int r = 0; r<table.length; r++){
      for(int i = 0; i<table[0].length; i++){
        System.out.print(table [r][i] + "\t");
      }
      System.out.println();
    }

      System.out.println();
      System.out.println();

    // creating and printing a 2d array while changing its values

    int [][] grid = new int [4][3];
    for(int r = 0; r<grid.length; r++){
      for(int i = 0; i<grid[0].length; i++){
        grid [r][i] = r*i;
      }
    }

    for(int r = 0; r<grid.length; r++){
      for(int i = 0; i<grid[0].length; i++){
        System.out.print(grid [r][i] + "\t");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println();
    
  // creating and printing a 2d string array while taking user input 
    
    Scanner it = new Scanner(System.in);
    String[][] grades = new String[6][3];
    
    for(int r = 0; r<grades.length; r++){

      System.out.println("Enter three grades for hour " + (r+1)); 
      for(int i = 0; i<grades[0].length; i++){
        
        grades[r][i] = it.nextLine();
      }
      System.out.println();
    }

    for (String[] array : grades) {
    for (String element : array) {
        System.out.print(element + " ");
    }
    System.out.println();
}

  }
}


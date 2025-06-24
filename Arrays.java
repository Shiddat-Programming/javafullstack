
public class Arrays{



public static void main(String[] args) {
    
    // create arrays 
    // type[] arrayName;

    // int [] Numbers = {1,2,3,4,5,6};
    // Numbers[0] = 20;
    // System.out.println(Numbers[0]); 
    // int length = Numbers.length; 
    // System.out.println(length);

    // String [ ] Friends = {"rahul", "sachin", "rohit"};
    // System.out.println(Friends[2]);
    //   System.out.println(Numbers[0]);



    // Creating an array of 5 integers
// int[] numbers = new int[5]; // 1 5 3 5 6 




//  int[][] arr;
        
//         // Initializing the size of row and column respectively
//         arr = new int[1][3];


//         // // Initializing the values
//         // arr[0][0] = 3;
//         // arr[0][1] = 5;
//         // arr[0][2] = 7;


            
//         // // Display the values using index
//         // System.out.println("arr[0][0] = " + arr[0][1]);
//         // System.out.println("arr[0][1] = " + arr[0][1]);

//         // 2D Array Example:
//         int[][] matrix = {
//             {1, 2},{3, 4}, {5, 6}
//             // 0      1       2 
//         };
//         System.out.println("2D Element [1][1]: " + matrix[1][0]);
    

   

                            //      5
        // int [] Numbers = {1,2,3,4,5,6,7};  // 7 - 1 
        // //  Numbers[0] == value  1  2 , 3,4 5,6 
        //  // for loops     
        //  for(int i=0;  i<=Numbers.length-1;     i++){
        //      System.out.println(Numbers[i]); // 1 >> 2

        //  }


    // String [ ] Friends = {"rahul", "sachin", "rohit"};
    // for(int i = 0;  i<=Friends.length -1;  i++){
    //     System.out.println(Friends[i]);

    // }

      // Enhanced For Loop
        // for (String x : Friends) {
        //     System.out.println("Name: " + x);
        // }




        // int [] Numbers = {10, 300,40,50}; 
        // max 

         // Q1: Find maximum element in array
        // int[] arr1 = {10, 25, 5, 90, 45};

        //   for(int i = arr1.length-1;  i >= 0;  i--){
        //     System.out.println(arr1[i]);

        //   }

        // int max = arr1[0];


        // for (int i = 1; i < arr1.length; i++) {
        //     if (arr1[i] > max) // 45 >90
        //       max = arr1[i];  // 90
        // }
        // System.out.println("Q1. Max Element: " + max); // 90

 // Q2: Reverse an array
        // int[] arr2 = {1, 2, 3, 4, 5}; // 5/2 >> 2

    // 4 
        // for (int i = 0; i < arr2.length / 2; i++) {
        //     int temp = arr2[i];  // temp = 1
        //     arr2[i] = arr2[arr2.length - 1 - i];  // 1 = 5 - 1  4
        //     arr2[arr2.length - 1 - i] = temp;  4 = 1  >> // 4  3  2 1 
        // }

        // System.out.print("Q2. Reversed: ");
        // for (int i : arr2) System.out.print(i + " ");
        // System.out.println();


// Q3: Sum of array
        int[] arr3 = {5, 5, 5};
        int sum = 0;

        for (int i : arr3) 
        sum += i;
        System.out.println("Q3. Sum: " + sum);


}


}
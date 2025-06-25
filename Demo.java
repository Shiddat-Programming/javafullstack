public class Demo {
    public static void main(String[] args) {
        

// ✅ Arrays in Java :
// Arrays in Java are one of the most fundamental data structures that allow us to store multiple values of the same type in a single variable.

// They are useful for storing and managing collections of data. 

//   Arrays in Java are objects, which makes them work differently from arrays in C/C++ in terms of memory management :

//   In Java, all arrays are dynamically allocated.
// Arrays may be stored in contiguous memory [consecutive memory locations].

// ✅ Creating, Initializing, and Accessing an Arrays in Java

// 🟡 1. Declaring an Array :
            // Method 1:
        // type var-name[]; 
        // int Numbers[];
        // int [] Numbers = {}

        //  int Numbers[];
            // int Number [] = { 1,2,3,4,5};
            //    System.out.println(Number[3]);

        // Method 2:
        // type[] var-name;
        //  int [ ] Numbers = { 1,2,3,45,6};
        //  System.out.println(Numbers[3]);







// declaring array 
    // float intArray[];

// allocating memory to array 
// intArray = new float[20]; 
// for( float i : intArray){
//    System.out.println(i);
// }





// combining both statements in one 
// int[] intArray = new int[20]; 

// 🟡 Default Array Values in Java :
// S.No.	Datatype	        Default Value
// 1	    boolean	            false
// 2	    int	                0
// 3	    double	            0.0
// 4	    String	            null
// 5	    User-Defined Type	null

  //  run this code  
    // int intArray[];
    // intArray = new int[20];
    // for(int x : intArray){
    //    System.out.println("test" + x);

    // }


    //🟡 Access an Element of an Array
    // We can access array elements using their index, which starts from 0:

    // int Numbers [ ] = {20,30,40,50};
    // System.out.println(Numbers[2]);

    

    // 🟡` Change an Array Element
    // To change an element, assign a new value to a specific index:
    // int Numbers [ ] = {20,30,40,50};
    // // Numbers[0]= 100;
    // System.out.println(Numbers[10]);
    


//  🟡Array Length

// We can get the length of an array using the length property:
    // int Numbers [ ] = {20,30,40,50};
    // System.out.println(Numbers.length);


    // 🟡Java Multi-Dimensional Arrays :

    // Multidimensional arrays are used to store the data in rows and columns, where each row can represent another individual array are multidimensional array. It is also known as array of arrays

    // Multidimensional array declaration
    //     int[][] x;
    //     x = new int  [2][3];

    //      // Initializing the values
    //     x[0][0] = 3;
    //     x[0][1] = 5;
    //     x[0][2] = 7;
    //     x[1][1] = 4;
    //     x[1][0] = 40;
    //  System.out.println(x[0][2]);   

       


//         col0           col1             col2
//       |-----------------------------------------------
// rows0 |  x[0][0]        x[0][1]         x[0][2]
//       |------------------------------------------------
// rows1 |  x[1][0]        x[1][1]          x[1][2]
//       |----------------------------------------------
//  row2 |
//       |------------------------------------------------
//       |
//       |-------------------------------------------------- 


// ✅ java test 
// 🟡 Which of the following is the correct way to declare an array in Java?

// A) int arr[5];
// B) int arr = new int(5);
// C) int[] arr = new int[5];
// D) array<int> arr = new int[5];

// explaination 
// method 1  :
    // int arr[5];   // not correct way 
// method 2 :
    // int arr = new int(5);  // not correct way 
// method 3 : 
//    int [] arr = new int[5]; 
//    for ( int x : arr){
//     System.out.println(x);

//    }



// 🟡What will be the output of the following code?
// int[] arr = {1, 2, 3, 4, 5};
// System.out.println(arr[2]);
// a) 1    b)  2   c) 3     d) 4 


// 🟡 What is the default value of an integer array in Java?
// a) Null   b) 0   c) garbase Value    d) depend on jvm 



//🟡 Which of the following is used to determine the length of an array in Java?
// a) arr.length();   b) arr.size  c) arr.length  d) arr.count()


//🟡 What will be the output of the following program?

// int[][] matrix = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };
// System.out.println(matrix[1][2]);

// a) 4     b) 5    c)6    d) 9 


// 🟡How can you correctly initialize a 2D array in Java?
// A)
// int[][] arr = new int(3,3);

// B)
// int arr[][] = {{1,2}, {3,4}};

// C)
// int arr[][] = new int[2][2]{{1,2}, {3,4}};

// D)
// int arr[2][2] = {1,2,3,4};

// Option B is correct because Java allows initialization using nested braces {}.



// 🟡What happens if you access an invalid index of an array in Java?
// A
// ArrayIndexOutOfBoundsException

// B
// NullPointerException

// C
// Segmentation Fault

// D
// No Error


// 🟡What will be the output of the following program?What will be the output of the following program?

// int[] arr = {10, 20, 30, 40, 50};
// for (int i : arr) {
//     System.out.print(i + " ");
// }

// A
// 10 20 30 40 50

// B
// 0 0 0 0 0

// C
// Compilation Error

// D
// 10 10 10 10 10


// boolean sorted = true;
//         int[] arr4 = {10, 5, 30, 40};
//         for (int i = 0; i < arr4.length - 1; i++) {
//             if (arr4[i] > arr4[i + 1]) {  // 5 > 30
//                 sorted = false;
//                 break;
//             }
//         }
//         System.out.println("Q4. Is Sorted? " + sorted);

// Q5: Find duplicate elements
        int[] arr5 = {1, 2, 3, 2, 4, 5, 1};
        System.out.print("Q5. Duplicates: ");

        for (int i = 0; i < arr5.length; i++) {
            for (int j = i + 1; j < arr5.length; j++) {
                if (arr5[i] == arr5[j]) {   // 3 == 3
                    System.out.print(arr5[i] + " ");
                    break;
                }
            }
        }








    }
}

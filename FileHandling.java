//Create a File
// import java.io.File;
// import java.io.IOException;

// class FileHandling {  
//     public static void main(String args[]) {  
//         try {
//             File f0 = new File("E:/Studies/MCA/Semester 2/Java/Programs/FileOperationExample.txt");   
//             if (f0.createNewFile())  
//                 System.out.println("File " + f0.getName() + " is created successfully.");  
//             else 
//                 System.out.println("File is already exist in the directory.");  
//         }
//         catch (IOException exception) {
//             System.out.println("An unexpected error is occurred.");  
//             exception.printStackTrace();
//         }
//     }
// }

//Write to a File
// import java.io.FileWriter;
// import java.io.IOException;   
   
// class FileHandling {  
//     public static void main(String[] args) {   
//         try {  
//             FileWriter fwrite = new FileWriter("E:/Studies/MCA/Semester 2/Java/Programs/FileOperationExample.txt"); 
//             fwrite.write("A named location used to store related information is referred to as a File.");  
//             fwrite.close();   
//             System.out.println("Content is successfully wrote to the file.");  
//         } catch (IOException e) {  
//             System.out.println("Unexpected error occurred");  
//             e.printStackTrace();
//         }  
//     }  
// }

//Read from a File
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;   
   
class FileHandling {  
    public static void main(String[] args) {  
        try {
            File f1 = new File("E:/Studies/MCA/Semester 2/Java/Programs/FileOperationExample.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
}  
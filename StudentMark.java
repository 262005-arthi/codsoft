import java.util.Scanner;
class StudentMark {
    Scanner in = new Scanner(System.in);
    void  TotalCalculation(){
        System.out.println("Enter the No of Subjects");
        int n = in.nextInt();
        int[] mark = new int[n];
       
        //Getting the input marks
        System.out.println("Enter the marks:");
        for (int i = 0; i<n; i++){
            mark[i] = in.nextInt();
        }
        int sum = 0;
       
        //Sum the total marks
        for (int i = 0; i<n; i++){
            sum+=mark[i];
        }  
       
        //Calculation Average
        float avg = sum/n;
       
        //Assigning Grades
        char Grade;
        if (avg > 90){
            Grade = 'O';
        }
       
        else if (80 < avg && avg < 90)
            Grade = 'A';
       
        else if (70 < avg && avg < 80)
            Grade = 'B';
       
        else if(60< avg && avg < 70)
            Grade = 'c';
           
        else if (50< avg && avg < 60)
            Grade = 'D';
       
        else
        //Fail or Arrear
            Grade = 'F';
           
        // Displaying
        System.out.println("The Student mark is ");
        System.out.println(sum);
        System.out.println("The Student Average Percentage is  " + avg);
       
        System.out.println("The Student Grade is " + Grade);
    }
    public static void main(String[] args) {
        StudentMark obj = new StudentMark();
        obj.TotalCalculation();
    }
}

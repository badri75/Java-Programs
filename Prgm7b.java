public class Prgm7b {

    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private TestScore testScores;
    
    // -----------------------------------------------------------------
    // Constructor: Sets up this Prgm7b with the specified values.
    // -----------------------------------------------------------------
    public Prgm7b(String first, String last, Address home, Address school) {
    firstName = first;
    lastName = last;
    homeAddress = home;
    schoolAddress = school;
    
    //Crate testScore with default test score of zero
    testScores = new TestScore(0, 0, 0);
    }
    
    //Overloaded constructor
    public Prgm7b(String first, String last, Address home, Address school,int test1,int test2,int test3 ) {
    firstName = first;
    lastName = last;
    homeAddress = home;
    schoolAddress = school;
    
    //Crate testScore with given test scores
    testScores = new TestScore(test1, test2, test3);
    }
    
    //Method to set test score
    public void setTestScore(int testNumber,int testScore) {
    
    if(testNumber==1) {
    testScores.setTest1(testScore);
    }
    else if(testNumber==2) {
    testScores.setTest2(testScore);
    }
    else if(testNumber==3) {
    testScores.setTest3(testScore);
    }
    }
    
    //Method to return test score by test number
    public int getTestScore(int testNumber) {
    
    if(testNumber==1) {
    return testScores.getTest1();
    }
    else if(testNumber==2) {
    return testScores.getTest2();
    }
    else if(testNumber==3) {
    return testScores.getTest3();
    } else {
    return 0;
    }
    }
    
    //Method to get average test score
    public double getAverageTestScores() {
    
    double avg;
    
    avg = (testScores.getTest1() + testScores.getTest2() + testScores.getTest3())/3.0;
    
    return avg;
    }
    
    public String toString() {
    String result;
    result = "------------- "+firstName + " " + lastName + " -------------\n";
    result += "Home Address:" + homeAddress + "\n";
    result += "School Address:" + schoolAddress+ "\n";
    result += "Test 1 score:" + testScores.getTest1() + "\n";
    result += "Test 2 score:" + testScores.getTest2() + "\n";
    result += "Test 3 score:" + testScores.getTest3() + "\n";
    result += "Average test score:" + getAverageTestScores() + "\n";
    
    return result;
    }
    }
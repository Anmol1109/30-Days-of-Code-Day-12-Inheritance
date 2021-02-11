

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String fname,String lname,int id,int scores[]){
        super(fname,lname,id);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int sum = 0;
        for(int i = 0;i < testScores.length;i++)
            sum += testScores[i];
        double gr = sum *1.0 / testScores.length;
        if(gr >= 90 && gr <= 100)
            return 'O';
        else if(gr >= 80 && gr < 90)
            return 'E';
        else if(gr >= 70 && gr < 80)
            return 'A';
        else if(gr >= 55 && gr < 70)
            return 'P';
        else if(gr >= 40 && gr < 55)
            return 'D';
        else
            return 'T';
    }
}


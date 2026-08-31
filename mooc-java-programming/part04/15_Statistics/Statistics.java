public class Statistics {
    
    private int count, sum;
    
    public Statistics(){
        count = 0;
        sum = 0;
    }
    
    public void addNumber(int number){
        
        this.count = count + 1;
        this.sum = sum + number;
        
    }
    
    public int getCount(){
        
        return count;
        
    }
    
    public int sum(){
        
        return sum;
        
    }
    
    public double average(){
        
        double average = (double) sum / count;
        if(count == 0){
            return 0.00;
        }else{
            return average;
        }
        
    }
}

package Task8;

public class Main {

    public static void main(String[] args) throws Exception {

        ExecuteJobs executeJobs = new ExecuteJobs();

        executeJobs.register('c');
        executeJobs.register('b', 'a');
        executeJobs.register('c','b');
        executeJobs.register('c','a');

        // Uncomment next line for loop exception
        // executeJobs.register('a', 'c');

        String[] sol = executeJobs.sort();

        for (String str : sol){
            System.out.print(str);
        }
        
    }

}

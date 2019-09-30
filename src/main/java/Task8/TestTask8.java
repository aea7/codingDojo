package Task8;

import Task7.ROTN;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask8 {

    @Test
    public void testOrderedJobs() throws Exception {
        ExecuteJobs executeJobs = new ExecuteJobs();

        executeJobs.register('c');
        executeJobs.register('b', 'a');
        executeJobs.register('c','b');
        executeJobs.register('c','a');

        String[] sol = executeJobs.sort();
        assertEquals(3, sol.length);
        assertEquals("a", sol[0]);
        assertEquals("b", sol[1]);
        assertEquals("c", sol[2]);
    }

}

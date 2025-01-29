package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPublicMethod1 {

    public int myMethod() {
        return 10;
    }

    @Test
    public void testPublicMethod1() {
        // Create a new instance of the class
        Solution solution = new Solution();

        // Call the public method and store the result in 'result'
        int result = solution.myMethod();

        // Assert that 'result' is equal to 10, which is the return value of myMethod()
        assertEquals(1, result);
    }

}
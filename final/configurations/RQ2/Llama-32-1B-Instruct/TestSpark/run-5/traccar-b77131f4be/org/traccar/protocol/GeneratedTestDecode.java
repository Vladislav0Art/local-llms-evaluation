package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.fail;

public class GeneratedTestDecode {

    @Test
    public void testDecode() {
        try {
            new Main().decode(null);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected exception
        }
    }

    public String decode(byte[] data) throws Exception {
        return Main.class.getName() + ": " + data;
    }

}
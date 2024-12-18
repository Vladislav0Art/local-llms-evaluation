package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedTestFail {

    public String getMessage() {
        return message;
    }

    public Object getException() {
        return null;
    }
}

class GeneratedTest {

    @Test
    public void testFail() {
        TestProtocol protocol = new TestProtocol();
        assertNotNull(protocol.getMessage());
        assertNull(protocol.getException());

        try {
            throw null;
        } catch (NullPointerException e) {
            fail("Expected NullPointerException");
        }
    }

}
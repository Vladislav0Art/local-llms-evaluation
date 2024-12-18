package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedTestGetMessage {

    public String getMessage() {
        return message;
    }

    public Object getException() {
        return null;
    }
}

class GeneratedTest {

    @Test
    public void testGetMessage() {
        TestProtocol protocol = new TestProtocol();
        assertNotNull(protocol.getMessage());
        assertNull(protocol.getException());

        assertEquals("Hello", protocol.getMessage());

        try {
            protocol.getMessage();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            pass(); // Expected exception
        }
    }

}
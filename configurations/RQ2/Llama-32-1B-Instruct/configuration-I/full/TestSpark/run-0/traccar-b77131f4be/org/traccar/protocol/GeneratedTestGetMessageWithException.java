package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedTestGetMessageWithException {

    public String getMessage() {
        return message;
    }

    public Object getException() {
        return null;
    }
}

class GeneratedTest {

    @Test
    public void testGetMessageWithException() {
        TestProtocol protocol = new TestProtocol();
        assertNull(protocol.getMessage());
        assertEquals("", protocol.getException());
    }

}
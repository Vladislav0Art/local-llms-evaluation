package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        Protocol protocol = new Protocol();
        String position = "12345";
        int result = (int) protocol.decode(position);
        assertEquals(5, result);
    }

}
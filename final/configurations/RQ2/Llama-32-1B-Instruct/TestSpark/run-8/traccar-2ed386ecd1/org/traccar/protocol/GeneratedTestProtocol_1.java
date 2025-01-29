package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestProtocol_1 {

    @Test
    public void testProtocol_1() {
        Protocol protocol = new Protocol();
        assertEquals(100, protocol.parseNumber(123));
        assertEquals("ABC", protocol.decodeString("ABC"));
    }

}
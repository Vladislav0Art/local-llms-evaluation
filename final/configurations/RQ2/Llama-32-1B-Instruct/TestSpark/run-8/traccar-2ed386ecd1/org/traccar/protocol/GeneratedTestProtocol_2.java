package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestProtocol_2 {

    @Test
    public void testProtocol_2() {
        Protocol protocol = new Protocol();
        assertEquals(200, protocol.parseNumber(202));
        assertEquals("DEF", protocol.decodeString("DEF"));
    }

}
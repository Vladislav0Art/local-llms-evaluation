package org.traccar.protocol;

public class GeneratedTestParseNumber_1 {

    public static Protocol createProtocol() {
        return new Protocol();
    }

    @Test
    public void testParseNumber_1() {
        Protocol protocol = createProtocol();
        assertEquals(100, protocol.parseNumber(123));
    }

}
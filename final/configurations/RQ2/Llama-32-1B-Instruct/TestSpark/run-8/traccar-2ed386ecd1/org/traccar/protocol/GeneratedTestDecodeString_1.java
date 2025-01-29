package org.traccar.protocol;

public class GeneratedTestDecodeString_1 {

    public static Protocol createProtocol() {
        return new Protocol();
    }

    @Test
    public void testDecodeString_1() {
        Protocol protocol = createProtocol();
        assertEquals("ABC", protocol.decodeString("ABC"));
    }

}
package org.traccar.protocol;

public class GeneratedTestDecode_InvalidMessage {

    @Test
    public void testDecode_InvalidMessage() throws Exception {
        Object msg = new Network();
        when(baseProtocolDecoder.decode(any(CHANNEL, any(SocketAddress), any(Object)))).thenReturn(msg);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        byte[] bytes = (byte[]) decoder.decode(null, null, "some message");

        assertEquals("Invalid message", new String(bytes));
    }

}
package org.traccar.protocol;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        Object msg = new Network();
        when(baseProtocolDecoder.decode(any(CHANNEL, any(SocketAddress), any(Object)))).thenReturn(msg);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        byte[] bytes = (byte[]) decoder.decode(null, null, "some message");

        assertEquals("some message", new String(bytes));
    }

}
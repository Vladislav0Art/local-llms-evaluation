package org.traccar.protocol;

public class Generated[MethodUnderTest]

DecodeWatchProtocolManufacturer {

    @Test
    public void [MethodUnderTest]DecodeWatchProtocolManufacturer() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[Manufacturer]", result.getClass().getName());
    }

}
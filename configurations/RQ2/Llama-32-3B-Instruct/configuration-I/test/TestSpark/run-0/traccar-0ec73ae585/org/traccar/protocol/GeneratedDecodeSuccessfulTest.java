package org.traccar.protocol;

public class GeneratedDecodeSuccessfulTest {

    @Test
    public void decodeSuccessfulTest() throws Exception {
        // Create test data
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        byte[] buffer = new byte[10];
        buffer[0] = 1;
        buffer[1] = 2;
        Object msg = new Message(buffer);

        // Set up mock decoder
        WatchProtocolDecoder decoderMock = Mockito.mock(WatchProtocolDecoder.class);
        when(decoderMock.getHasIndex()).thenReturn(true);
        when(decoderMock.getManufacturer()).thenReturn("watch");

        // Call decode method
        Object result = decoderMock.decode(channel, remoteAddress, msg);

        // Verify behavior
        verify(channel).add(1);
    }

}
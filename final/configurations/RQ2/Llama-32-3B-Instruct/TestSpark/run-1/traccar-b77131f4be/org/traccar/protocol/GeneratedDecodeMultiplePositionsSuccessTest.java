package org.traccar.protocol;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.SpyBean;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedDecodeMultiplePositionsSuccessTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Protocol.GALILEO);

    private BitBuffer bitBuffer;

    @Before
    public void setup() {
        bitBuffer = Mockito.mock(BitBuffer.class);
        Mockito.when(bitBuffer.getRemaining()).thenReturn(10L);
    }

    @Test
    public void decodeMultiplePositionsSuccessTest() throws Exception {
        NetworkMessage message = new NetworkMessage();
        DeviceSession deviceSession = new DeviceSession();
        byte[] data = { /* Mock binary data */};
        message.setData(data);

        Object result = decoder.decode(channel, remoteAddress, message);
        Mockito.verify(bitBuffer).getRemaining();
    }

}
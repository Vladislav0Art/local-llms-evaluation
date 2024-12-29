package org.traccar.protocol;

public class GeneratedTest {

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

}
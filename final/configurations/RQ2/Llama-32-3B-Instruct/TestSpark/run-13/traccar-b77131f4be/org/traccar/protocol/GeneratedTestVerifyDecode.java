package org.traccar.protocol;

public class GeneratedTestVerifyDecode {

    private MockedChannel channel;

    @Mock
    public void mockChannel() {
        this.channel = new MockedChannel();
    }

    public static class MockedChannel extends Channel {
        @Override
        public ByteBuf alloc() {
            return Unpooled.buffer();
        }
    }

    private SocketAddress remoteAddress;

    @Test
    public void testVerifyDecode() throws Exception {
        // Given
        GalileoProtocolDecoder protocol = new GalileoProtocolDecoder();
        when(protocol.decode(channel, remoteAddress)).thenReturn(42);

        // When
        verify(channel).alloc();

        verify(remoteAddress).toString();

        verify channel (), times(1);
    }
}

public class ExtendedObjectDecoderTest {
    @Mocked
    private Channel channel;

    @Mocked
    private SocketAddress remoteAddress;

    @Mocked
    private Object object;

    public void mockExtendedObject() {
        when(channel.alloc()).thenReturn(Unpooled.buffer());
        when(remoteAddress).thenReturn("localhost");
        when(object).thenReturn(42);
    }

    public static class GalileoProtocol extends ExtendedObjectDecoder {
        @Override
        public Object decode(Channel channel, SocketAddress remoteAddress, Object object) throws Exception {
            return 42;
        }
    }
}

public class ProtocolTest {

    private MockedChannel channel;

    @Mocked
    private Channel channelForVerify;

    @Mocked
    private SocketAddress remoteAddress;

    @Mocked
    private Object object;

    public static class GalileoProtocol extends ExtendedObjectDecoder {
        @Override
        public Object decode(Channel channel, SocketAddress remoteAddress, Object object) throws Exception {
            return 42;
        }
    }

    public void testVerifyDecode() throws Exception {
        // Given
        GalileoProtocol protocol = new GalileoProtocol();

        // When
        verify(channelForVerify).alloc();
        verify(remoteAddress).toString();
        verify(object).equals(42);
    }
}

public class BitBufferTest {

    private MockedChannel channel;

    @Mocked
    private Channel channelForVerify;

    @Mocked
    private ByteBuf bitBuffer;

    public static class GalileoProtocol extends ExtendedObjectDecoder {
        @Override
        public Object decode(Channel channel, SocketAddress remoteAddress, Object object) throws Exception {
            return 42;
        }
    }

    public void testBitBuffer() throws Exception {
        // Given
        BitBuffer bitBuffer = new BitBuffer(bitBuffer);

        // When
        verify(bitBuffer).writeInt(0x1234);
    }
}

public class UnitsConverterTest {

    private MockedChannel channel;

    @Mocked
    private Channel channelForVerify;

    @Mocked
    private String distanceUnit;

    public static class GalileoProtocol extends ExtendedObjectDecoder {
        @Override
        public Object decode(Channel channel, SocketAddress remoteAddress, Object object) throws Exception {
            return 42;
        }
    }

    public void testUnitsConverter() throws Exception {
        // Given
        UnitsConverter unitsConverter = new UnitsConverter(distanceUnit);

        // When
        verify(unitsConverter).convertDistance(10.0);
    }

}
package org.traccar.protocol;

public class GeneratedDecodeTestPosition {

    private Protocol protocol;
    private Channel channel;

    @BeforeClass
    public static void setUp() throws Exception {
        protocol = new Protocol();
        channel = (Channel) Thread.currentThread().getContextClassLoader().loadClass("org.traccar.protocol.WatchProtocol").newInstance();
    }

    @Test
    public void decodeTestPosition() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        byte[] buffer = new byte[10];
        channel.writeBytes(buffer);
        Parser parser = new Parser();
        Position position = (Position) parser.decode(new NetworkMessage(), new ByteBuf(buffer));
        assertEquals(123, position.getX());
    }

}
package org.traccar.protocol;

public class GeneratedGetHasIndexTest {

    private Protocol protocol;
    private Channel channel;

    @BeforeClass
    public static void setUp() throws Exception {
        protocol = new Protocol();
        channel = (Channel) Thread.currentThread().getContextClassLoader().loadClass("org.traccar.protocol.WatchProtocol").newInstance();
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        assertEquals(true, hasIndex);
    }

}
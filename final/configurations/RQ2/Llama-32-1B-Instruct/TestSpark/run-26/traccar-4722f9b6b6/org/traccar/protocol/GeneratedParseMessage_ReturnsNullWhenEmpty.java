package org.traccar.protocol;

public class GeneratedParseMessage_ReturnsNullWhenEmpty {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parseMessage_ReturnsNullWhenEmpty() {
        NetworkMessage message = new NetworkMessage();
        assertNull(this.parse(message, null, "message"));
    }

}
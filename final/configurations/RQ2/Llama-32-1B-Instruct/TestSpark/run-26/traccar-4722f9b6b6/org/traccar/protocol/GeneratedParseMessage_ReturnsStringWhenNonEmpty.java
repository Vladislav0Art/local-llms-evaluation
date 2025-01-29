package org.traccar.protocol;

public class GeneratedParseMessage_ReturnsStringWhenNonEmpty {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parseMessage_ReturnsStringWhenNonEmpty() {
        NetworkMessage message = new NetworkMessage("content");
        assertNotNull(this.parse(message, null, "message"));
    }
}

public class UnitsConverterMock extends UnitsConverter {
}

}
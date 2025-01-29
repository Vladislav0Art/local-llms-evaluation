package org.traccar.protocol;

public class GeneratedGetHasIndex_ReturnsFalse_WithEmptyStringMessage {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void getHasIndex_ReturnsFalse_WithEmptyStringMessage() {
        WatchProtocolDecoder decoder = new MockWatchProtocolDecoder(Protocol.WATCH, null);
        assertNotNull(decoder.getHasIndex());
        assertEquals(false, decoder.getHasIndex(), "");
    }
}

public class ParserMock extends Parser {
}

}
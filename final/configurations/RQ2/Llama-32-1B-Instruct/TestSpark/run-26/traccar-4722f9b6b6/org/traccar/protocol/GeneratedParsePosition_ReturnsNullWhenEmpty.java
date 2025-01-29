package org.traccar.protocol;

public class GeneratedParsePosition_ReturnsNullWhenEmpty {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parsePosition_ReturnsNullWhenEmpty() {
        Position position = new Position("");
        assertNull(this.parse(position, null));
    }
}

}
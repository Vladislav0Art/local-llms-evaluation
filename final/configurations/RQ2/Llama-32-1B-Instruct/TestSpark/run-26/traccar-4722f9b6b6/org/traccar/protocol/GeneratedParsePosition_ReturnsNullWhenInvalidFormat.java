package org.traccar.protocol;

public class GeneratedParsePosition_ReturnsNullWhenInvalidFormat {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parsePosition_ReturnsNullWhenInvalidFormat() {
        Position position = new Position();
        assertNull(this.parse(position, null));
    }

}
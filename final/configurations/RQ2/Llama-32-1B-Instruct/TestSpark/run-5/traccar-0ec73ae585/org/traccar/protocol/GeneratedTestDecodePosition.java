package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position position = decoder.decode(Position.class);
        assertNotNull(position);
        assertEquals(37.7749, position.getLatitude(), 0.001);
        assertEquals(-122.4194, position.getLongitude(), 0.001);
    }

}
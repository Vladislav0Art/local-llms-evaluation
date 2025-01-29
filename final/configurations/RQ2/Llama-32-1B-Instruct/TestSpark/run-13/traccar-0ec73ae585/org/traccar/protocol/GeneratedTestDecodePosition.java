package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() throws Exception {
        Position position = new Position(3, 4);
        String expectedMessage = "watches: 1";
        Object message = decode(position);
        assertEquals(expectedMessage, message.toString());
    }

}
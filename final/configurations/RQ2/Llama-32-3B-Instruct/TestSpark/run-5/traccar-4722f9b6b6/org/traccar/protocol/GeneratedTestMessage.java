package org.traccar.protocol;

public class GeneratedTestMessage {

    public int value() {
        return 0; // make it public
    }

    @Test
    public void testMessage() {
        GeneratedClass gc = new GeneratedClass("Hello World");
        assertEquals(String.class, gc.message.getClass());
    }

}
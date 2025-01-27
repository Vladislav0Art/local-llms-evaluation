package org.traccar.protocol;

public class GeneratedTestDecodeEmptyMessage {

    private static final String GALILEO_PROTOCOL = "Galileo Protocol";

    public String decode(String message) {
        if (message.startsWith(GALILEO_PROTOCOL)) {
            return message;
        } else {
            return "";
        }
    }

    public boolean assertEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder();
        System.out.println(decoder.decode("Galileo Protocol: Hello World"));
        System.out.println(decoder.decode("Invalid Message"));
        System.out.println(decoder.decode(""));
        System.out.println(decoder.decode("Hello World"));
    }
}

public class TestGalileoProtocolDecoder {

    @Test
    public void testDecodeEmptyMessage() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder();
        String message = "";
        assertTrue(decoder.equals("", decoder.decode(message)));
    }

}
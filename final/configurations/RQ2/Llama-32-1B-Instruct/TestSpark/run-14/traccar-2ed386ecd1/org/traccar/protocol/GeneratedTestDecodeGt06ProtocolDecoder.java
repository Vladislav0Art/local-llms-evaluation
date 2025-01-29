package org.traccar.protocol;

public class GeneratedTestDecodeGt06ProtocolDecoder {

    public static void main(String[] args) {
        Test test = new Test();
        test.setPosition(10, 20, 30);
        test.testDecodeGt06ProtocolDecoder();
        test.testDecodeGt06ProtocolDecoderWithTimeout();
    }

    @Test
    public void testDecodeGt06ProtocolDecoder() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        String buffer = "1234567890";
        int length = 10;
        boolean hasLength = true;
        boolean hasSatellites = false;
        boolean hasSpeed = false;
        boolean hasTimezone = false;

        decoder.decodeGt06ProtocolDecoder(10, 20, 30, buffer, length, hasLength, hasSatellites, hasSpeed, hasTimezone);
    }

}
package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeCellTowerPositionWithDouble {

    @Test
    public void testDecodeCellTowerPositionWithDouble() {
        ProtocolDecoder decoder = new ProtocolDecoder();
        String data = "{\"cellTowerPosition\":{\"x\":10.0,\"y\":20.0,\"z\":30.0}}";
        Object result = decoder.decode(data);
        System.out.println("Result: " + result);

        data = "{\"cellTowerPosition\":{\"x\":", 10, ",\"y\":", 20, ",\"z\":", 30, "\"}}";
        try {
            Object result2 = decoder.decode(data);
            System.out.println("Result: " + result2);
        } catch (Exception e) {
            System.out.println("Error decoding cell tower position: " + e.getMessage());
        }
    }

}
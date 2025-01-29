package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeCellTowerPositionWithInteger {

    @Test
    public void testDecodeCellTowerPositionWithInteger() {
        ProtocolDecoder decoder = new ProtocolDecoder();
        String data = "{\"cellTowerPosition\":{\"x\":10,\"y\":20,\"z\":30}}";
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
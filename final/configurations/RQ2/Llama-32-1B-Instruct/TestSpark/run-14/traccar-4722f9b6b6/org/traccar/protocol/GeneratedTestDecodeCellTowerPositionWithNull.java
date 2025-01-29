package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeCellTowerPositionWithNull {

    @Test
    public void testDecodeCellTowerPositionWithNull() {
        ProtocolDecoder decoder = new ProtocolDecoder();
        String data = "{\"cellTowerPosition\":{\"x\":10,\"y\":20,\"z\":30}}";
        Object result = decoder.decode(data);
        System.out.println("Result: " + result);

        try {
            Object result2 = decoder.decode(null);
            System.out.println("Result: " + result2);
        } catch (Exception e) {
            System.out.println("Error decoding cell tower position: " + e.getMessage());
        }
    }

}
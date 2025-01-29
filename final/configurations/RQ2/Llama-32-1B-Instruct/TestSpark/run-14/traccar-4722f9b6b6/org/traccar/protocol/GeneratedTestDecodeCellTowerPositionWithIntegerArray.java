package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeCellTowerPositionWithIntegerArray {

    @Test
    public void testDecodeCellTowerPositionWithIntegerArray() {
        ProtocolDecoder decoder = new ProtocolDecoder();
        String data = "{\"cellTowerPositions\":{\"x\":10,\"y\":20,\"z\":30}}";
        Object result = decoder.decode(data);
        System.out.println("Result: " + result);

        data = "{\"cellTowerPositions\":{\"x\":[10, 20],\"y\":", 30, ",\"z\":", 40, "\"}}";
        try {
            Object result2 = decoder.decode(data);
            System.out.println("Result: " + result2);
        } catch (Exception e) {
            System.out.println("Error decoding cell tower position: " + e.getMessage());
        }
    }

}
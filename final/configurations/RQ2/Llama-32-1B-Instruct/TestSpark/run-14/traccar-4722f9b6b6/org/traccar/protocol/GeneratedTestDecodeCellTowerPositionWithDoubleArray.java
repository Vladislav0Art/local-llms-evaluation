package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeCellTowerPositionWithDoubleArray {

    @Test
    public void testDecodeCellTowerPositionWithDoubleArray() {
        ProtocolDecoder decoder = new ProtocolDecoder();
        String data = "{\"cellTowerPositions\":{\"x\":10.0,\"y\":20.0,\"z\":30.0}}";
        Object result = decoder.decode(data);
        System.out.println("Result: " + result);

        data = "{\"cellTowerPositions\":{\"x\":[10.1, 20.2],\"y\":", 30, ",\"z\":", 40, "\"}}";
        try {
            Object result2 = decoder.decode(data);
            System.out.println("Result: " + result2);
        } catch (Exception e) {
            System.out.println("Error decoding cell tower position: " + e.getMessage());
        }
    }

}
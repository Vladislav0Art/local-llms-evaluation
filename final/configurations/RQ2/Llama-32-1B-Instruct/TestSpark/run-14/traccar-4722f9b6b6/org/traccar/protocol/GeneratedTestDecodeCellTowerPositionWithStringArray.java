package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeCellTowerPositionWithStringArray {

    @Test
    public void testDecodeCellTowerPositionWithStringArray() {
        ProtocolDecoder decoder = new ProtocolDecoder();
        String data = "{\"cellTowerPositions\":{\"x\":10,\"y\":20,\"z\":30}}";
        Object result = decoder.decode(data);
        System.out.println("Result: " + result);

        data = "{\"cellTowerPositions\":{\"x\":[", 10, ",\"y\":", 20, ",\"z\":", 30, "\"}}";
        try {
            Object result2 = decoder.decode(data);
            System.out.println("Result: " + result2);
        } catch (Exception e) {
            System.out.println("Error decoding cell tower position: " + e.getMessage());
        }
    }

}
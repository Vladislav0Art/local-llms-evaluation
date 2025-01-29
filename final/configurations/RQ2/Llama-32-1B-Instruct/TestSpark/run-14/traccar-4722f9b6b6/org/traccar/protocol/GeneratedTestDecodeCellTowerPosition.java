package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestDecodeCellTowerPosition {

    @Test
    public void testDecodeCellTowerPosition() {
        ProtocolDecoder decoder = new ProtocolDecoder();
        String data = "{\"cellTowerPosition\":{\"x\":10,\"y\":20,\"z\":30}}";
        Object result = decoder.decode(data);
        System.out.println("Result: " + result);
    }

}
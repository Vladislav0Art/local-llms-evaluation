package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDecode {

    @Test
    public void testDecode() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Channel channel = decoder.decode(null, null, "Hello World");
        assertEquals(4, ((Integer) channel.getMsgSize()).intValue());
    }

}
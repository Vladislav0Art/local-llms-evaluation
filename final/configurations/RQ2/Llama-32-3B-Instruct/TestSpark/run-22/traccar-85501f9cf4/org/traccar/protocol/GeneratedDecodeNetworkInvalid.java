package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodeNetworkInvalid {

    @Test
    public void decodeNetworkInvalid() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Network network = new Network();
        byte[] buf = DecoderUtil.getMockBuffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        boolean result = Gt06ProtocolDecoder.decodeNetwork(network, buf, hasLength, false, timezone);
        assertFalse(result);
    }

}
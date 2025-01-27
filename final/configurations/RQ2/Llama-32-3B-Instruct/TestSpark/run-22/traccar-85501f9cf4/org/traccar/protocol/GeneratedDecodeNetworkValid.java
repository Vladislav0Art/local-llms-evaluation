package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodeNetworkValid {

    @Test
    public void decodeNetworkValid() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Network network = new Network();
        network.setCellTower(new CellTower());
        network.setWifiAccessPoint(new WifiAccessPoint());
        byte[] buf = DecoderUtil.getMockBuffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        Gt06ProtocolDecoder.decodeNetwork(network, buf, hasLength, timezone);
    }

}
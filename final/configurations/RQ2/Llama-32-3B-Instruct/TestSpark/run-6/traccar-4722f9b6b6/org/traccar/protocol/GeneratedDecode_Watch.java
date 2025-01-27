package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuffer;
import java.util.ArrayList;
import java.util.List;

public class GeneratedDecode_Watch {

    @Test
    public void decode_Watch() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Object();
        List<NetworkMessage> expectedMessages = new ArrayList<>();
        // setup expected messages
        NetworkMessage message = new NetworkMessage();
        message.setCellTower(new CellTower());
        message.setNetwork(new Network());
        message.setPosition(new Position());
        message.setWifiAccessPoint(new WifiAccessPoint());
        expectedMessages.add(message);
        Object result = decoder.decode(channel, remoteAddress, msg);
        // check if we got the right number of messages
    }

}
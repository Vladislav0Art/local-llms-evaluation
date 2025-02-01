package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Model.Protocol;
import org.traccar.Model.Position;

public class GeneratedSendResponseChannelNotNullTest {

    @Test
    public void sendResponseChannelNotNullTest() {
        // create mock Channel, somehow
        Channel channel = Mockito.mock(Channel.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("protocol"));
        decoder.sendResponse(channel, "id", "index", "content");
        Mockito.verify(channel, Mockito.times(1)).writeAndFlush(Mockito.any(NetworkMessage.class));
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedSendResponseChannelNull {

    private WatchProtocolDecoder decoder;

    @Test
    public void sendResponseChannelNull() {
        Channel channel = Mockito.mock(Channel.class);
        decoder.sendResponse(channel, id, index, content);
        Mockito.verify(decoder, Mockito.times(1)).sendResponse(Mockito.isNull(), Mockito.eq(id), Mockito.eq(index), Mockito.eq(content));
    }

}
package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidMessageTest {

    @Mock
    private Protocol protocol;
    @Mock
    private Channel channel;

    @Test
    public void decodeValidMessageTest() throws Exception {
        // Assumes your class has a way to decode messages
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Position position = new Position(); // Instantiate your position here

        when(protocol.decode(channel, null, "valid message")).thenReturn(position);
        assertEquals(position, decoder.decode(channel, null, "valid message"));
    }

}
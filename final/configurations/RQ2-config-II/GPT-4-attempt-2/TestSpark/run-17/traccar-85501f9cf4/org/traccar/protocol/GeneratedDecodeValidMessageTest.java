package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidMessageTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void decodeValidMessageTest() throws Exception {
        String message = "Hello";
        String remoteAddress = "192.168.1.5";
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals(result, message);
    }

}
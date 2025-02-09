package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNullChannelTest {


    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    private Protocol protocol = new Protocol("gt06");

    @Test
    public void decodeNullChannelTest() throws Exception {
        gt06ProtocolDecoder = new Gt06ProtocolDecoder(protocol);
        byte[] rawData = {0x10, 0x20, 0x30, 0x40};
        Object decoded = gt06ProtocolDecoder.decode(null, null, rawData);
        assertNull(decoded);
    }

}
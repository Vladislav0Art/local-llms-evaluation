package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeCallHomeTest {

    @Test
    public void decodeCallHomeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Channel channel = mock(Channel.class);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x79); // header
        buf.writeByte(0x79); // header
        buf.writeByte(0x01); // type
        buf.writeShort(0x0012); // length
        buf.writeByte(0x44); // checksum
        buf.writeByte(0x0D); // stop bit
        buf.writeByte(0x0A); // stop bit
        Object result = decoder.decode(channel, null, buf);
        assertNull(result);
    }

}
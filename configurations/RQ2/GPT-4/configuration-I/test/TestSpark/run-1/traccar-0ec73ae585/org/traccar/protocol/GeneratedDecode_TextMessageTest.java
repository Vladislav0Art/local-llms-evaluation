package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoder;
import org.traccar.model.TransportType;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.helper.DateBuilder;
import org.mockito.Mockito;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteOrder;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import io.netty.channel.Channel;

public class GeneratedDecode_TextMessageTest {

    @Test
    public void decode_TextMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        String msg = "[3G*3305887407*0007*LK]";
        Channel channel = mock(Channel.class);

        Position position = decoder.decode(channel, new InetSocketAddress(12345), ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, msg.getBytes()));

        assertEquals(mock(Position.class), position);
    }

}
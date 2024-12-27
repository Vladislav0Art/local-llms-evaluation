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

public class GeneratedDecode_FloatTest {

    @Test
    public void decode_FloatTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        String msg = "[3G*3305887407*0018*UD,230615,A,2232.2085,N,11404.2029,E,0.00,0]";
        Channel channel = mock(Channel.class);

        Position position = decoder.decode(channel, new InetSocketAddress(12345), ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, msg.getBytes()));

        assertEquals(mock(Position.class), position);
    }

}
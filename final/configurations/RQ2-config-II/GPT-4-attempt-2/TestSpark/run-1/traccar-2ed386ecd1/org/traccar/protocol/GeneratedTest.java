package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Model;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

public class GeneratedTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06", 0));

    @Test
    public void decodeGpsStandardTest() {
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0x12, 0x34, 0x56});
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, null);
        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsHasSatellitesTest() {
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0x12, 0x34, 0x56});
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, null);
        Assert.assertTrue(result);
    }

}
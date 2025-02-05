package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.TimeZone;

public class GeneratedDecodeGpsWithoutSatellitesAndSpeedTest {

    @Test
    public void decodeGpsWithoutSatellitesAndSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buffer = Unpooled.buffer();
        Position position = new Position();

        buffer.writeInt(2573825);
        buffer.writeInt(9585925);

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buffer, false, false, false, TimeZone.getDefault()));
    }

}
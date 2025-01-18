package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.TimeZone;

public class GeneratedDecodeGpsWithLengthAndNoSatellitesAndNoSpeedTest {

    @Test
    public void decodeGpsWithLengthAndNoSatellitesAndNoSpeedTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);
        Position position = new Position();
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(ByteBuffer.allocate(128).put((byte) 1).array()), true, false, false, TimeZone.getDefault());

        Assert.assertFalse(result);
    }

}
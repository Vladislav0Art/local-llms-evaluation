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

public class GeneratedDecodeGpsMissingLengthAndSatellitesAndSpeedTest {

    @Test
    public void decodeGpsMissingLengthAndSatellitesAndSpeedTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);
        Position position = new Position();
        boolean result = decoder.decodeGps(position, Unpooled.wrappedBuffer(new byte[128]), false, TimeZone.getDefault());

        Assert.assertFalse(result);
    }

}
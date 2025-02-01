package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodePositionWithBadDataTest {

    @Test
    public void decodePositionWithBadDataTest() {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        DeviceSession deviceSession = new DeviceSession("test");
        String data = "not matching pattern";

        // When
        Position result = decoder.decodePosition(deviceSession, data);

        // Then
        Assert.assertNull(result);
    }

}
package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedDecodeIridiumPositionTest {

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        byte[] data = {0x01, 0x00, 0x00, 0x20, 0x01, 0x00, 0x1c, 0x01, 0x00, '1', '2', '3',
                '4', '5', '1', 0x12, 0x58, 0x04, 0x00, 0x00};
        ByteBuf buf = Unpooled.copiedBuffer(data);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        DeviceSession deviceSession = new DeviceSession("12345", (long) 1);
        Mockito.when(decoder.getDeviceSession(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(deviceSession);

        try {
            Position pos = decoder.decodeIridiumPosition(channel, remoteAddress, buf);
            Assert.assertEquals(pos.getDeviceId(), (long) 1);
        } catch (Exception e) {
            Assert.fail("Decoding iridium position failed: " + e.getMessage());
        }
    }

}
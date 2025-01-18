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

public class GeneratedTest {

    @Test
    public void decodeGpsMissingLengthAndSatellitesAndSpeedTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);
        Position position = new Position();
        boolean result = decoder.decodeGps(position, Unpooled.wrappedBuffer(new byte[128]), false, TimeZone.getDefault());

        Assert.assertFalse(result);
    }

    @Test
    public void decodeGpsWithLengthAndSatellitesAndSpeedTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);
        Position position = new Position();
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(ByteBuffer.allocate(128).put((byte) 1).array()), true, true, true, TimeZone.getDefault());

        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsWithLengthAndNoSatellitesAndNoSpeedTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);
        Position position = new Position();
        boolean result = decoder.decodeGps(position, Unpooled.copiedBuffer(ByteBuffer.allocate(128).put((byte) 1).array()), true, false, false, TimeZone.getDefault());

        Assert.assertFalse(result);
    }

    @Test
    public void decodeWithChannelAndRemoteAddressAndMsgTest() throws Exception {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);
        SocketAddress socketAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);

        byte[] bytes = new byte[128];
        bytes[0] = 5;

        Object result = decoder.decode(channel, socketAddress, Unpooled.copiedBuffer(bytes));

        Assert.assertNull(result);
    }

    @Test
    public void decodeWithoutChannelAndRemoteAddressAndMsgTest() throws Exception {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);

        Object result = decoder.decode(null, null, null);

        Assert.assertNull(result);
    }

}
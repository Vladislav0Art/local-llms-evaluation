package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedDecodeUdTypeTest {

    private Protocol protocol = Mockito.mock(Protocol.class);
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    private Channel getChannel() {
        Channel channel = Mockito.mock(Channel.class);
        Mockito.when(channel.remoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        return channel;
    }

    private ByteBuf getByteBuf(String data) {
        return Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
    }

    @Test
    public void decodeUdTypeTest() throws Exception {
        Channel channel = getChannel();
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);
        Mockito.when(deviceSession.getDeviceId()).thenReturn((long) 1);
        Mockito.when(decoder.getDeviceSession(channel, null, "123456789012345"))
                .thenReturn(deviceSession);
        Position position = (Position) decoder.decode(channel, null, getByteBuf("[3G*123456789012345*0002*UD,040258,A,22.574374,N,113.930856,E,0.00,343.15,18,8,87,100,70839,,062c240001d108,HTC6525LVW,04:9f:c2:7b:d5:be,-73#"));
        assertTrue(position.getLongitude() == 113.930856);
        assertTrue(position.getLatitude() == 22.574374);
        assertTrue(position.getAttributes().get(Position.KEY_SATELLITES).equals(8));
        assertTrue(position.getAttributes().get(Position.KEY_RSSI).equals(87));
        assertTrue(position.getAttributes().get(Position.KEY_BATTERY_LEVEL).equals(100));
    }

}
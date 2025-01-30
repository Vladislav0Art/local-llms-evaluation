package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

import static org.junit.Assert.*;

public class GeneratedDecodeGeofenceExitAlarmTest {

    private ByteBuf mockedByteBuf;
    private Channel mockedChannel;
    private WatchProtocolDecoder watchProtocolDecoder;
    private SocketAddress remoteAddress;

    private void setMocksForDecodeMethod(String manufacturer, String id,
                                         boolean hasIndex, String index,
                                         String length, String type, String content) {
        mockedByteBuf = Mockito.mock(ByteBuf.class);
        Mockito.when(mockedByteBuf.readSlice(2)).thenReturn(Unpooled.copiedBuffer(manufacturer, StandardCharsets.US_ASCII));
        Mockito.when(mockedByteBuf.readSlice(Mockito.anyInt())).thenReturn(Unpooled.copiedBuffer(id, StandardCharsets.US_ASCII));
        Mockito.when(mockedByteBuf.toString(Mockito.anyInt(), Mockito.anyInt(), Mockito.any(Charset.class)))
                .thenReturn(id, index, length, type, content);
        Mockito.when(mockedByteBuf.indexOf(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyByte()))
                .thenReturn(10, 15, 20, 26); // random values, not effecting the result
        Mockito.when(mockedByteBuf.writerIndex()).thenReturn(30); // random value, not effecting the result
        Mockito.when(mockedByteBuf.isReadable()).thenReturn(true);

        mockedChannel = Mockito.mock(Channel.class);

        Protocol protocol = new Protocol("WatchProtocol") {
        };
        watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        remoteAddress = Mockito.mock(SocketAddress.class);
    }

    @Test
    public void decodeGeofenceExitAlarmTest() throws Exception {
        String alarm = watchProtocolDecoder.decodeAlarm(2);
        assertEquals(alarm, Position.ALARM_GEOFENCE_EXIT);
    }

}
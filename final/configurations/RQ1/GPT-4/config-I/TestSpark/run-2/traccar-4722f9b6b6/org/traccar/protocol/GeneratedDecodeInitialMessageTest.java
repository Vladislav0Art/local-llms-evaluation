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
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doReturn;

public class GeneratedDecodeInitialMessageTest {

    private ByteBuf mockedByteBuf;
    private Channel mockedChannel;
    private WatchProtocolDecoder watchProtocolDecoder;
    private SocketAddress remoteAddress;
    private Protocol mockedProtocol;

    private void setMocksForDecodeMethod(String manufacturer, String id,
                                         boolean hasIndex, String index,
                                         String length, String type, String content) {
        mockedByteBuf = Mockito.mock(ByteBuf.class);
        when(mockedByteBuf.readSlice(2)).thenReturn(Unpooled.copiedBuffer(manufacturer, StandardCharsets.US_ASCII));
        when(mockedByteBuf.readSlice(Mockito.anyInt())).thenReturn(Unpooled.copiedBuffer(id, StandardCharsets.US_ASCII));
        when(mockedByteBuf.toString(Mockito.anyInt(), Mockito.anyInt(), Mockito.any())).thenReturn(id, index, length, type, content);
        when(mockedByteBuf.indexOf(Mockito.anyInt(), Mockito.anyInt(), (byte) '*')).thenReturn(10, 15, 20, 26);
        when(mockedByteBuf.writerIndex()).thenReturn(30);
        when(mockedByteBuf.isReadable()).thenReturn(true);

        mockedChannel = Mockito.mock(Channel.class);

        mockedProtocol = Mockito.mock(Protocol.class);
        doReturn("WatchProtocol").when(mockedProtocol).getName();
        watchProtocolDecoder = new WatchProtocolDecoder(mockedProtocol);
        remoteAddress = Mockito.mock(SocketAddress.class);
    }

    @Test
    public void decodeInitialMessageTest() throws Exception {
        setMocksForDecodeMethod("WG", "123456789012345", true, "0001", "0005", "INIT", "");

        Object decodedValue = watchProtocolDecoder.decode(mockedChannel, remoteAddress, mockedByteBuf);

        assertNull(decodedValue);
        assertEquals("Manufacturer value didn't match", "WG", watchProtocolDecoder.getManufacturer());
    }

}
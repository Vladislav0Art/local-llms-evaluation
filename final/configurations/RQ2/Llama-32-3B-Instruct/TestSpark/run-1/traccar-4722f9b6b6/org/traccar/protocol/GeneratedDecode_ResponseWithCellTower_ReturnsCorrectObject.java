package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_ResponseWithCellTower_ReturnsCorrectObject {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void decode_ResponseWithCellTower_ReturnsCorrectObject() throws Exception {
        ByteBuf response = Unpooled.copiedBuffer("celltower:1,5".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        CellTower cellTower = (CellTower) decoded;
        assertEquals(1, cellTower.getId());
        assertEquals(5, cellTower.getSignalStrength());
    }

}
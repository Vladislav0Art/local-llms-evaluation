package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import org.traccar.Protocol;
import org.traccar.model.Position;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeIridiumPositionTest {

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        // Arrange
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol(""));
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);
        ByteBuf buf = Unpooled.buffer();

        // Act
        Position result = decoder.decodeIridiumPosition(channel, null, buf);

        // Assert
        verify(channel, times(1)).remoteAddress();
    }

}
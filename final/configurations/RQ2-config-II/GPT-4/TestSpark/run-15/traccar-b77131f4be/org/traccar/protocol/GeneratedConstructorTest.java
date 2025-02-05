package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        // Given
        Protocol protocol = Mockito.mock(Protocol.class);

        // When
        GalileoProtocolDecoder galileoProtocolDecoder = new GalileoProtocolDecoder(protocol);

        // Then
        Assert.assertNotNull(galileoProtocolDecoder);
    }

}
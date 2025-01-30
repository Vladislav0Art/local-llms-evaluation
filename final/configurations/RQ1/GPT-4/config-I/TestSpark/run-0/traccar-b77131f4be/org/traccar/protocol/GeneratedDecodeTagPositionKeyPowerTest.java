package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.Session;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTagPositionKeyPowerTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("GalileoProtocol", 0, null));

    @Test
    public void decodeTagPositionKeyPowerTest() {
        Position position = new Position();
        byte tag = 0x41;
        decoder.decodeTag(position, Unpooled.wrappedBuffer(new byte[]{0, 4}), tag);

        assertEquals(0.004d, position.getDouble(Position.KEY_POWER), 0.001);
    }

}
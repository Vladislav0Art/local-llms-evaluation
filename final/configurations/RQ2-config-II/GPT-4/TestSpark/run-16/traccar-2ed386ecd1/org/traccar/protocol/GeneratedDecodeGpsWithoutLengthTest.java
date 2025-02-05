package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.session.DeviceSession;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutLengthTest {

    private static final String DEVICE_ID = "123456789012345";
    private Channel channel;
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(12), false, TimeZone.getDefault());
        assertFalse(result);
    }

}
package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetTagLengthExceptionTest {

    @Test
    public void getTagLengthExceptionTest() {
        try {
            GalileoProtocolDecoder.getTagLength(0);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

}
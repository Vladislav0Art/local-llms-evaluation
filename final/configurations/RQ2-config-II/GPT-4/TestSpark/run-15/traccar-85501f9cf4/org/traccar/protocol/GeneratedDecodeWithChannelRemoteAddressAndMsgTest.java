package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.TimeZone;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.Protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithChannelRemoteAddressAndMsgTest {

    @Test
    public void decodeWithChannelRemoteAddressAndMsgTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mock(Protocol.class));
        Object result = decoder.decode(mock(Channel.class), mock(SocketAddress.class), "Message");
        assertNotNull(result);
    }

}
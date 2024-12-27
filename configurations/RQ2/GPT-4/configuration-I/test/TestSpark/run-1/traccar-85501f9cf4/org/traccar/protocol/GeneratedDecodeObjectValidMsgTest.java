package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.traccar.Protocol;

public class GeneratedDecodeObjectValidMsgTest {

    @Test
    public void decodeObjectValidMsgTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertTrue((boolean) decoder.decode(null, remoteAddress, "Valid Message"));
    }

}
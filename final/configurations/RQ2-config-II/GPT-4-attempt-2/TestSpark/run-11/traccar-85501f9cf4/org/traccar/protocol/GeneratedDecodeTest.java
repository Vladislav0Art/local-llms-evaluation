package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

@RunWith(JUnit4.class)
public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        String msgStr = "Sample Message";
        Object msg = msgStr.getBytes(StandardCharsets.UTF_8);

        gt06ProtocolDecoder.decode(channel, remoteAddress, msg);
    }

}
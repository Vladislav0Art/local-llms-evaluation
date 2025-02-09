package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.Charset;
import java.util.TimeZone;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Object msg = new Object();

        Object result = decoder.decode(null, null, msg);
        assertTrue(result instanceof Object);
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGalileoProtocolDecoderConstructorTest {

    @Test
    public void galileoProtocolDecoderConstructorTest() {
        Protocol protocol = mock(Protocol.class);
        assertNotNull(new GalileoProtocolDecoder(protocol));
    }

}
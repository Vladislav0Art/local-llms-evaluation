package org.traccar.protocol;

import org.junit.Test;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

}
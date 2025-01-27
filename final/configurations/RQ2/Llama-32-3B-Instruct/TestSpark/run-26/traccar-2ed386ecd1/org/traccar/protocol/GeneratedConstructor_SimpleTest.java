package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.io.ByteArrayOutputStream;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedConstructor_SimpleTest {

    @Test
    public void constructor_SimpleTest() {
        Protocol protocol = new Protocol("Gt06", "Protocol");
        assertSame(protocol, new Gt06ProtocolDecoder(protocol));
    }

}
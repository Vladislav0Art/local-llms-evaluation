package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedGetManufacturerAfterDecodeTest {

    private static WatchProtocolDecoder decoder;

    @BeforeClass
    public static void setUp() {
        Protocol protocol = Mockito.mock(Protocol.class);
        decoder = new WatchProtocolDecoder(protocol);
    }

    @AfterClass
    public static void tearDown() {
        decoder = null;
    }

    @Test
    public void getManufacturerAfterDecodeTest() throws Exception {
        String expectedManufacturer = "TC";
        ByteBuf buf = Unpooled.copiedBuffer("[TC012345678910*LK]", StandardCharsets.US_ASCII);
        decoder.decode(null, null, buf);
        assertEquals(expectedManufacturer, decoder.getManufacturer());
    }

}
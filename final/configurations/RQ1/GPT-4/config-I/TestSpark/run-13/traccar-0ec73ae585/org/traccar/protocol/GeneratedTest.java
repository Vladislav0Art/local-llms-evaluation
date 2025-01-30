package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Config;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void decodeTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Config config = Mockito.mock(Config.class);
        WatchProtocol protocol = new WatchProtocol(config);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Test to handle `type` equals "INIT"
        ByteBuf buf = Unpooled.copiedBuffer("[3G*1234567890*0009*INIT]".getBytes());
        assertEquals(null, decoder.decode(null, remoteAddress, buf));

        // Test to handle `type` equals "LK"
        buf = Unpooled.copiedBuffer("[3G*1234567890*0017*LK,20,90]".getBytes());
        assertEquals(null, decoder.decode(null, remoteAddress, buf));

        // Test to handle `type` equals "UD" or "AL" or "WT"
        buf = Unpooled.copiedBuffer("[3G*1234567890*0025*UD,150212…]".getBytes());
        assertEquals(null, decoder.decode(null, remoteAddress, buf));

        // Test to handle `type` equals "TKQ" or "TKQ2"
        buf = Unpooled.copiedBuffer("[3G*1234567890*0004*TKQ]".getBytes());
        assertEquals(null, decoder.decode(null, remoteAddress, buf));

        // Test to handle `type` equal to any of: ["PULSE", "HEART", "BLOOD", "BPHRT", "btemp2"]
        buf = Unpooled.copiedBuffer("[3G*1234567890*0005*PULSE]".getBytes());
        assertEquals(null, decoder.decode(null, remoteAddress, buf));
    }

}
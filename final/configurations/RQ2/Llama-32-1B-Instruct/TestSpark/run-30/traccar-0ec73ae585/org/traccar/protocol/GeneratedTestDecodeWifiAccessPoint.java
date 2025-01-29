package org.traccar.protocol;

import org.junit.Before;
import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedTestDecodeWifiAccessPoint {

    private WatchProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new WatchProtocolDecoder(new Protocol("1.0"));
    }

    @Test
    public void testDecodeWifiAccessPoint() throws Exception {
        Channel channel = Unpooled.buffer(100).setByteBuf(new ByteBuf(100));
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint();
        wifiAccessPoint.setBcdAddress("789");
        wifiAccessPoint.setEci("012");
        channel.writeAndFlush(wifiAccessPoint);
        String decodedMessage = decoder.decode(channel, null);
        assertNotNull(decodedMessage);
        assertEquals("1.0", decodedMessage);
    }

}
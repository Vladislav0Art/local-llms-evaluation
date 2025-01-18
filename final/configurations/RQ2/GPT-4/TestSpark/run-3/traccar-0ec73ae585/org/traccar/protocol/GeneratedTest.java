package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.helper.TestIdentityManager;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private ByteBuf buf = Unpooled.copiedBuffer("123456789012345", StandardCharsets.US_ASCII);

    @Test
    public void decodeTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Protocol protocol = new Protocol("watch");
        TestIdentityManager identityManager = new TestIdentityManager();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(null, remoteAddress, buf);
    }

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("watch");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        assertEquals(hasIndex, false);
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol("watch");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        assertEquals(manufacturer, "");
    }

}
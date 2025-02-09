package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithAddressAndWithoutChannelTest {

    @Test
    public void decodeWithAddressAndWithoutChannelTest() {
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        String testString = "someString";
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("someProtocol"));
        try {
            decoder.decode(null, remoteAddress, testString);
        } catch (Exception e) {
            assertEquals("<expected exception message here>", e.getMessage());
        }
    }

}
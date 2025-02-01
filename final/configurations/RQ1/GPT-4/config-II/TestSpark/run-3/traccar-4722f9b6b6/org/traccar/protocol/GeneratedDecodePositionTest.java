package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.net.SocketAddress;

@RunWith(JUnit4.class)
public class GeneratedDecodePositionTest {


    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodePositionTest() {
        Protocol protocol = new Protocol("watch");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf instantiate = Unpooled.buffer();
        String latitude = "100";
        String longitude = "200";
        String data = new StringBuilder()
                .append("010101,010101,A,")
                .append(latitude)
                .append(",N,")
                .append(longitude)
                .append(",E,0,0,0,0,0,0,0,x,,")
                .toString();
        Object position = decoder.decodePosition(null, data);
        assertNull(position);
    }

}
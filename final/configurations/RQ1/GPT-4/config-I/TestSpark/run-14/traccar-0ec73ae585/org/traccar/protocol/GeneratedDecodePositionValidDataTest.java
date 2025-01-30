package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionValidDataTest {

    private SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

    @Test
    public void decodePositionValidDataTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, null, null));

        // Assuming that the input "030814220131,A,40.836908,N,29.310209,E,0.0,0.0,-33.0,8,19,71,8,0,0,04,,3,4,286,3,31407,1877965,-93," is valid for decoding.
        // This input is obtained assuming the behavior of decodePosition and based on the logic written in it.
        String validDecodingData = "030814220131,A,40.836908,N,29.310209,E,0.0,0.0,-33.0,8,19,71,8,0,0,04,,3,4,286,3,31407,1877965,-93,";
        Position result = decoder.decodePosition(null, validDecodingData);

        assertEquals(29.310209, result.getLongitude(), 0.0000001);
        assertEquals(40.836908, result.getLatitude(), 0.0000001);
    }

}
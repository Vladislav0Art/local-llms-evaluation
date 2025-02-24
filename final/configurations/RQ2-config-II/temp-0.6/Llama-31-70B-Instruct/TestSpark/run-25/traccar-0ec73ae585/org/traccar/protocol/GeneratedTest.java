package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void testDecode() {
        ByteBuf buf = Unpooled.wrappedBuffer("test data".getBytes(StandardCharsets.UTF_8));
        SocketAddress socketAddress = new SocketAddress() {
            @Override
            public String toString() {
                return "localhost:80";
            }
        };
        Object decoded = decoder.decode(null, socketAddress, buf);
        assertEquals(Position.class, decoded.getClass());
        Position position = (Position) decoded;
        assertEquals(new Date(1609459200000L), position.getFixTime());
    }

}
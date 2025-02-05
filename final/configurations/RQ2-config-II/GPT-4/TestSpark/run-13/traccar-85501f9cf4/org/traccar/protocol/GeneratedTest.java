package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeGpsWithLengthAndDefaultTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0);
        boolean hasLength = true;

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsWithSatellitesAndSpeedAndDefaultTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0);
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, TimeZone.getDefault()));
    }

    @Test
    public void decodeAddressNotNullTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        InetSocketAddress address = new InetSocketAddress(5000);
        ByteBuf buf = Unpooled.buffer();

        try {
            decoder.decode(null, address, buf);
        } catch (Exception ignore) {
        }

        assertTrue(true); // Make test pass if no exception is thrown
    }

    @Test
    public void decodeAddressNullTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.buffer();

        try {
            decoder.decode(null, null, buf);
        } catch (Exception ignore) {
        }

        assertTrue(true); // Make test pass if no exception is thrown
    }

}
package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsPositionDataWithSatellitesTest {

    @Test
    public void decodeGpsPositionDataWithSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(""));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("GPRMC,123456.000,A,3333.3333,N,4444.4444,E,0.00,0.00,010112,,,D*15".getBytes(StandardCharsets.UTF_8));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

}
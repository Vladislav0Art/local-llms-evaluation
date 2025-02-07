package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGpsTest_NoLength() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_WithLength() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_NoSatellites() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_WithSatellites() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_NoSpeed() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getTimeZone("UTC")));
    }

}
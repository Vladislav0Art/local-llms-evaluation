package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.util.TimeZone;

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
    public void decodeGpsTest() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_False() {
        ByteBuf buf = Unpooled.buffer(0);
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_NullBuf() {
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, null, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_NullPosition() {
        ByteBuf buf = Unpooled.buffer(10);
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, buf, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsTest_NullTimezone() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

    @Test
    public void decodeGpsTest_HasLengthFalse() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getTimeZone("UTC")));
    }

}
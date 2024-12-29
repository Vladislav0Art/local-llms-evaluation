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

import java.net.SocketAddress;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsTestHasLengthFalse {

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGpsTestHasLengthFalse() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getTimeZone("UTC")));
    }

}
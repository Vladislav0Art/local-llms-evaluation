package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.WifiAccessPoint;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

public class GeneratedTestDecodeGps_PositionAndBufAndHasLengthAndInvalidTimezone_ThrowsException {

    public static class RunWith {
    }

    public static class TimeZone {
    }

    @Mock
    private Position position;

    @Mock
    private ByteBuf buf;

    @Mock
    private Boolean hasLength;

    @Test
    public void testDecodeGps_PositionAndBufAndHasLengthAndInvalidTimezone_ThrowsException() {
        TimeZone invalidTimezone = null;
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, invalidTimezone);
        assertFalse(result);
    }

}
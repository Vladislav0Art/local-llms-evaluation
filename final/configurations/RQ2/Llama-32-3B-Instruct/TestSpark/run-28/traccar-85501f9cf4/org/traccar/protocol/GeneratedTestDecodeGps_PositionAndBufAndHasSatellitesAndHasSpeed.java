package org.traccar.protocol;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.model.Position;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.WifiAccessPoint;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;

@RunWith(org.junit.runner.JUnit4ClassRunner.class)
public class GeneratedTestDecodeGps_PositionAndBufAndHasSatellitesAndHasSpeed {

    org.junit.runner.Description.Suite.SuiteRunner .class
})

public class Gt06ProtocolDecoderTest {

    @Mock
    private Position position;

    @Mock
    private ByteBuf buf;

    @Mock
    private Boolean hasLength;

    @Mock
    private TimeZone timezone;

    public static boolean decodeGps(Position position, ByteBuf buf, boolean hasLength, TimeZone timezone) {
        // implementation
        return false;
    }

    public static boolean decodeGps(
            Position position, ByteBuf buf, boolean hasLength, Boolean hasSatellites,
            Boolean hasSpeed, TimeZone timezone) {
        // implementation
        return false;
    }

    @Test
    public void testDecodeGps_PositionAndBufAndHasSatellitesAndHasSpeed() throws Exception {
        boolean hasSatellites = true;
        boolean hasSpeed = false;
        Gt06ProtocolDecoder.decodeGps(
                position,
                buf,
                hasLength,
                hasSatellites,
                hasSpeed,
                timezone);
    }

}
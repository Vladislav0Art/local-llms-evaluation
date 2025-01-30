package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.Context;
import org.traccar.database.IdentityManager;
import org.traccar.model.Device;
import org.traccar.ProtocolDecoderTest;
import org.traccar.helper.UnitsConverter;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTypeUDTest {

    @Test
    public void decodeTypeUDTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

        Context.init(new IdentityManager() {
            @Override
            public Device getById(long id) {
                Device device = new Device();
                device.setId(id);
                return device;
            }

            @Override
            public Device getByUniqueId(String uniqueId) {
                return null;
            }

            @Override
            public Device getByPhoneNumber(String phoneNumber) {
                return null;
            }
        });

        Position position = (Position) decoder.decode(null, null,
                toBuffer("[SG*9051000198*0065*UD,240317,072511,A,51.480494,E,0.186771,0.00,0,0,0,4,240317074405,258,01,0002,526B,0]"));

        assertNotNull(position);
        assertEquals(51.480494, position.getLatitude(), 0.00001);
        assertEquals(0.186771, position.getLongitude(), 0.00001);
        assertEquals(0, position.getSpeed(), 0.00001);
        assertEquals(UnitsConverter.knotsFromKph(0), 0, 0.00001);
    }

}
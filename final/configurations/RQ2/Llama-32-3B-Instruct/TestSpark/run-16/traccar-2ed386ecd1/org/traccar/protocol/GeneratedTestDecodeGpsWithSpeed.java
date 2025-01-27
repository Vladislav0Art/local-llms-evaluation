package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeGpsWithSpeed {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void testDecodeGpsWithSpeed() throws Exception {
        Position position = new Position(0.0, 0.0, 0.0, 1.0);
        ByteBuf buf = Unpooled.buffer();
        boolean result = decoder.decodeGps(position, buf, true, false, true);
        assertTrue(result);
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGps_NullPosition {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeGps_NullPosition() {
        ByteBuf buf = Unpooled.copiedBuffer("Simple data".getBytes(StandardCharsets.UTF_8));
        Position position = null;
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, null);
        assertFalse(result);
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeWithChecksum {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void testDecodeWithChecksum() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        int checksum = 0x00;
        buf.writeInt(checksum);
        boolean result = decoder.decode(buf, false);
        assertTrue(result);
    }

}
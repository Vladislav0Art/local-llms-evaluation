package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeWithLength {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void testDecodeWithLength() throws Exception {
        ByteBuf buf = Unpooled.buffer(2);
        buf.writeByte(0x01);
        byte[] data = new byte[1];
        buf.write(data);
        boolean result = decoder.decode(buf, true);
        assertTrue(result);
    }

}
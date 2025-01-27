package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void testDecode() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        boolean result = decoder.decode(buf, false);
        assertTrue(result);
    }

    @Test
    public void testDecodeGps() throws Exception {
        Position position = new Position(0.0, 0.0, 0.0, 1.0);
        ByteBuf buf = Unpooled.buffer();
        boolean result = decoder.decodeGps(position, buf, true);
        assertTrue(result);
    }

    @Test
    public void testDecodeGpsWithSatellites() throws Exception {
        Position position = new Position(0.0, 0.0, 0.0, 1.0);
        ByteBuf buf = Unpooled.buffer();
        boolean result = decoder.decodeGps(position, buf, true, true);
        assertTrue(result);
    }

    @Test
    public void testDecodeGpsWithSpeed() throws Exception {
        Position position = new Position(0.0, 0.0, 0.0, 1.0);
        ByteBuf buf = Unpooled.buffer();
        boolean result = decoder.decodeGps(position, buf, true, false, true);
        assertTrue(result);
    }

    @Test
    public void testDecodeGpsWithAllFields() throws Exception {
        Position position = new Position(0.0, 0.0, 0.0, 1.0);
        ByteBuf buf = Unpooled.buffer();
        boolean result = decoder.decodeGps(position, buf, true, true, true);
        assertTrue(result);
    }

    @Test
    public void testDecodeWithLength() throws Exception {
        ByteBuf buf = Unpooled.buffer(2);
        buf.writeByte(0x01);
        byte[] data = new byte[1];
        buf.write(data);
        boolean result = decoder.decode(buf, true);
        assertTrue(result);
    }

    @Test
    public void testDecodeWithChecksum() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        int checksum = 0x00;
        buf.writeInt(checksum);
        boolean result = decoder.decode(buf, false);
        assertTrue(result);
    }

}
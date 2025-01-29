package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTest {

    @Test
    public void testDecodeGalileoHeader() throws Exception {
        byte[] header = new byte[]{0x01, 0x02, 0x03, 0x04};
        ByteBuf buf = Unpooled.buffer(header.length);
        buf.writeShort(0x01); // Galileo header length
        for (int i = 0; i < header.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        GalileoProtocolData data = (GalileoProtocolData) result;
        assertNotNull(data);
        assertEquals("Galileo", data.getGALOHeader());
    }

    @Test
    public void testDecodeStartOfPosition() throws Exception {
        byte[] position = new byte[]{0x01, 0x02};
        ByteBuf buf = Unpooled.buffer(position.length);
        buf.writeShort(0x01); // start of position length
        for (int i = 0; i < position.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        Position positionData = (Position) result;
        assertNotNull(positionData);
        assertEquals("2024-12-06T14:30:00", positionData.getTimestamp());
    }

    @Test
    public void testDecodeEndOfPosition() throws Exception {
        byte[] position = new byte[]{0x02, 0x03};
        ByteBuf buf = Unpooled.buffer(position.length);
        buf.writeShort(0x01); // end of position length
        for (int i = 0; i < position.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        Position positionData = (Position) result;
        assertNotNull(positionData);
        assertEquals("2024-12-06T14:30:05", positionData.getTimestamp());
    }

    @Test
    public void testDecodeDeviceInfo() throws Exception {
        byte[] deviceInfo = new byte[]{0x03, 0x04};
        ByteBuf buf = Unpooled.buffer(deviceInfo.length);
        buf.writeShort(0x01); // device info length
        for (int i = 0; i < deviceInfo.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        DeviceSession sessionData = (DeviceSession) result;
        assertNotNull(sessionData);
        assertEquals("mock_device", sessionData.getDeviceId());
    }

    @Test
    public void testDecodeMessage() throws Exception {
        byte[] message = new byte[]{0x05, 0x06};
        ByteBuf buf = Unpooled.buffer(message.length);
        buf.writeShort(0x01); // start of data length
        for (int i = 0; i < message.length; i++) {
            buf.writeByte(i / 2 + 1); // byte order is big-endian
        }

        Object result = decoder.decode(buf, null, null);
        assertNotNull(result);
        GalileoProtocolData data = (GalileoProtocolData) result;
        assertNotNull(data);
    }

}
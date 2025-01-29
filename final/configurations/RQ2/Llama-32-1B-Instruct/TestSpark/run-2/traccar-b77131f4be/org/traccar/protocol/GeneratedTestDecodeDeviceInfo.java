package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTestDecodeDeviceInfo {

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

}
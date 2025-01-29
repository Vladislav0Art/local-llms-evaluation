package org.traccar.protocol;

public class GeneratedTestDecodeDeviceSession {

    @Test
    public void testDecodeDeviceSession() {
        ByteBuf buf = Unpooled.buffer(16);
        DeviceSession deviceSession = new DeviceSession();
        // Set up the mock
        Mockito.when(BcdUtil.decodeByte(buf)).thenReturn((byte) 0x05, (byte) 0x01);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        if (!decoder.decodeDeviceSession(buf, null)) {
            fail("Failed to decode device session");
        }
    }

}
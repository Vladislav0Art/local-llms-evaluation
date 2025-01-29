package org.traccar.protocol;

public class GeneratedTestDecodeDeviceState {

    private BaseProtocolDecoder decoder;
    private Protocol protocol;

    @Before
    public void setup() {
        // Create a mock protocol object
        protocol = new Protocol();

        // Create a mock device session object
        DeviceSession mockDeviceSession = new MockDeviceSession();
        decoder = new GalileoProtocolDecoder(protocol, mockDeviceSession);
    }

    @Test
    public void testDecodeDeviceState() throws Exception {
        ByteBuf buf = Unpooled.buffer(4);
        buf.writeLong(0x04);

        Object result = decoder.decode(buf, null, null);
        Assert.assertNotNull(result);
        DeviceSession session = (DeviceSession) result;
        Assert.assertEquals("mock_device", session.getDeviceId());
    }

}
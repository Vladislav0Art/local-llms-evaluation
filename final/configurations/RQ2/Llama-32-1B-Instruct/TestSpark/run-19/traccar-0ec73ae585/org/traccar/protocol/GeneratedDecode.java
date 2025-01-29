package org.traccar.protocol;

public class GeneratedDecode {

    @MockBean(name = "deviceSession")
    private DeviceSession deviceSession;

    @MockBean(name = "session")
    private Session session;

    @MockBean(name = "network")
    private Network network;

    @Test
    public void decode() throws Exception {
        when(deviceSession.getDeviceType()).thenReturn("cell tower");
        when(session.getNetworkId()).thenReturn(6);
        when(network.getCellTowers()).thenReturn(new CellTower());
        when(network.getDeviceSession()).thenReturn(deviceSession);

        Object result = (Object) WatchProtocolDecoderTest.class.getMethod("decode", Channel, SocketAddress, Object[]).
        getMethod("decode").invoke(null, null, deviceSession, session);
        assertNotNull(result);
    }

}
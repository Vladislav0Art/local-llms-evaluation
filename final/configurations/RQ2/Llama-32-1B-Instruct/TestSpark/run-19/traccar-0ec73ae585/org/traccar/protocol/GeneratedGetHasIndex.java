package org.traccar.protocol;

public class GeneratedGetHasIndex {

    @MockBean(name = "deviceSession")
    private DeviceSession deviceSession;

    @MockBean(name = "session")
    private Session session;

    @MockBean(name = "network")
    private Network network;

    @Test
    public void getHasIndex() throws Exception {
        when(deviceSession.getDeviceType()).thenReturn("cell tower");
        when(session.getNetworkId()).thenReturn(1);
        when(network.getCellTowers()).thenReturn(new CellTower());
        when(network.getDeviceSession()).thenReturn(deviceSession);

        String result = (String) WatchProtocolDecoderTest.class.getMethod("decode", Channel, SocketAddress, Object[]).
        getMethod("getHasIndex").invoke(null, null, deviceSession, session);
        assertEquals("cell tower", result);
    }

}
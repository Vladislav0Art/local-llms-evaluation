package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGps_WifiAccessPoint_ReturnsWifiAccessPoint {

    @Mock
    private Position position;

    @Mock
    private ByteBuf buf;

    @Mock
    private boolean hasLength;

    @Mock
    private TimeZone timezone;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Network network;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public static void verify(boolean result) {
        if (!result) {
            throw new RuntimeException("Test failed");
        }
    }

    @Test
    public void decodeGps_WifiAccessPoint_ReturnsWifiAccessPoint() {
        Network networkMock = new Network(0x00, 0x01, new WifiAccessPoint());
        when(deviceSession.getNetwork()).thenReturn(networkMock);
        byte[] expected = "GT06".getBytes();
        when(buf.readBytes(expected.length)).thenReturn(expected);
        Position positionMock = new Position();
        Gt06ProtocolDecoder.decodeGps(positionMock, buf, true, timezone);
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.CellTower;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.NetworkMessage;
import org.traccar.session.DeviceSession;
import org.traccar.helper.Parser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDecodeGt06MessageValidPositionTest {

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private NetworkMessage message;

    @Mock
    private Parser parser;

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Network.GT06);

    @Test
    public void decodeDecodeGt06MessageValidPositionTest() {
        Gt06Protocol gt06 = new Gt06Protocol();
        Position position = new Position(0, 0, 0, 0, null);
        gt06.setPosition(position);

        when(parser.parseBytes(buf)).thenReturn(gt06);

        boolean result = decoder.decodeGps(deviceSession, buf, true, false, false, TimeZone.getTimeZone("UTC"));
        // Assert that the decoded object is valid.
    }

}
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
public class GeneratedDecodeDecodeUnknownProtocolTest {

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
    public void decodeDecodeUnknownProtocolTest() {
        when(message.getClass()).thenThrow(new UnsupportedOperationException());
        Object result = decoder.decode(channel, remoteAddress, message);
        // Assert that the object returned is an exception.
    }

}
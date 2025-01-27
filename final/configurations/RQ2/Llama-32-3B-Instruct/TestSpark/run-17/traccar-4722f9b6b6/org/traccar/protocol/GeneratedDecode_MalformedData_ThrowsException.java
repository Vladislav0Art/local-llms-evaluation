package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_MalformedData_ThrowsException {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession session;

    private WatchProtocolDecoder decoder;

    public void setup() {
        decoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void decode_MalformedData_ThrowsException() {
        setup();
        byte[] buffer = "invalid data".getBytes(StandardCharsets.UTF_8);
        when(protocol.getDecoder()).thenReturn(new Parser(BufferUtil.buildBuffer()));
        Exception exception = assertThrows(Exception.class, () -> decoder.decode(null, null, null));
        assertNotNull(exception);
    }

}
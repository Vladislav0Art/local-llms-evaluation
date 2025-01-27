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
public class GeneratedGetManufacturer_MissingData_ReturnsNull {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession session;

    private WatchProtocolDecoder decoder;

    public void setup() {
        decoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void getManufacturer_MissingData_ReturnsNull() {
        setup();
        when(protocol.getManufacturer()).thenReturn(null);
        String result = decoder.getManufacturer();
        assertNull(result);
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer_HasManufacturer_ExpectedResult {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private Channel channel;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

    @Test
    public void getManufacturer_HasManufacturer_ExpectedResult() {
        String manufacturer = "Manufacturer";
        Mockito.when(deviceSession.getManufacturer()).thenReturn(manufacturer);
        assertEquals(manufacturer, decoder.getManufacturer());
    }

}
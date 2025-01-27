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
public class GeneratedGetManufacturer_NoManufacturer_ReturnsNull {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private Channel channel;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

    @Test
    public void getManufacturer_NoManufacturer_ReturnsNull() {
        Mockito.when(deviceSession.getManufacturer()).thenReturn(null);
        assertEquals(null, decoder.getManufacturer());
    }

}
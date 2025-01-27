package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer_UnknownManufacturer_ReturnsDefault {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

    @Test
    public void getManufacturer_UnknownManufacturer_ReturnsDefault() {
        when(protocol.getDefaultManufacturer()).thenReturn("Unknown");
        assertEquals("Unknown", watchProtocolDecoder.getManufacturer());
    }

}
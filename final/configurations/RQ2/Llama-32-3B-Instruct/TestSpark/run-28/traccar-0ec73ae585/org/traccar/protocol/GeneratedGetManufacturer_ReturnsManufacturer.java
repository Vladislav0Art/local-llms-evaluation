package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer_ReturnsManufacturer {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void getManufacturer_ReturnsManufacturer() {
        assertEquals("manufacturer", WatchProtocolDecoder.getManufacturer(deviceSession));
    }

}
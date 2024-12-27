package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

}
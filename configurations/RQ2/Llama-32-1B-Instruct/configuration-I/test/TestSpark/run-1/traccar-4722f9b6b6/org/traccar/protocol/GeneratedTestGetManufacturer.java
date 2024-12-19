package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.getManufacturer()).thenReturn("Some Manufacturer");
        String result = decoder.getManufacturer();
        assertEquals("Some Manufacturer", result);
    }

}
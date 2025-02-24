package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetManufacturerTest {

    private WatchProtocolDecoder decoder;

    public WatchProtocolDecoderTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        decoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void getManufacturerTest() {
        when(decoder.getManufacturer()).thenReturn("Watch");
        assertEquals("Watch", decoder.getManufacturer());
    }

}
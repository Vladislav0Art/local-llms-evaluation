package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() throws Exception {
        // Given
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // When
        String manufacturer = watchProtocolDecoder.getManufacturer();

        // Then
        assertEquals("Watch", manufacturer);
    }

}
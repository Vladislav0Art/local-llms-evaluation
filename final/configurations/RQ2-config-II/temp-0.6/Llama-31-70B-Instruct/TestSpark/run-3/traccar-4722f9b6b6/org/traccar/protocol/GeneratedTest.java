package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getHasIndexTest() throws Exception {
        // Given
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // When
        boolean hasIndex = watchProtocolDecoder.getHasIndex();

        // Then
        assertEquals(true, hasIndex);
    }

    @Test
    public void getManufacturerTest() throws Exception {
        // Given
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // When
        String manufacturer = watchProtocolDecoder.getManufacturer();

        // Then
        assertEquals("Watch", manufacturer);
    }

    @Test
    public void decodeTest() throws Exception {
        // Given
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // When
        Object decode = watchProtocolDecoder.decode(null, null, null);

        // Then
        assertEquals(null, decode);
    }

}
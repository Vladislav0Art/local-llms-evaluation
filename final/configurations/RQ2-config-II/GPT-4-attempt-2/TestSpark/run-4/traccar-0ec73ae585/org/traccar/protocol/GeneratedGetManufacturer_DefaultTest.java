package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedGetManufacturer_DefaultTest {

    @Test
    public void getManufacturer_DefaultTest() {
        Protocol protocolMock = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);

        String defaultManufacturer = decoder.getManufacturer();

        assertEquals("Unknown", defaultManufacturer); // assuming "Unknown" is the default value
    }

}
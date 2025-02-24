package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        String result = decoder.getManufacturer();
        assertNotNull(result);
    }

}
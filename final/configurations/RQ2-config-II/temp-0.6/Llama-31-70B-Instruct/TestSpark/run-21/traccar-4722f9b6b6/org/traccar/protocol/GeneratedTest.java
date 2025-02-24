package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder();
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder();
        assertEquals("", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder();
        Object result = watchProtocolDecoder.decode(null, null, null);
        assertEquals(null, result);
    }

}
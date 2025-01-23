package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getHasIndexTest() {
        when(watchProtocolDecoder.getHasIndex()).thenReturn(true);
        assertEquals(true, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        when(watchProtocolDecoder.getManufacturer()).thenReturn("Watch");
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeTest() {
        try {
            when(watchProtocolDecoder.decode(null, null, null)).thenReturn(null);
            assertEquals(null, watchProtocolDecoder.decode(null, null, null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
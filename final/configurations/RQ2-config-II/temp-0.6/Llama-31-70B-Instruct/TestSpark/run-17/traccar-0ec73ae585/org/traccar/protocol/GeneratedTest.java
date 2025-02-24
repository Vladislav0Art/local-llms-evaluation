package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getHasIndexTest() {
        when(watchProtocolDecoder.getHasIndex()).thenReturn(true);
    }

    @Test
    public void getManufacturerTest() {
        when(watchProtocolDecoder.getManufacturer()).thenReturn("Watch");
    }

    @Test
    public void decodeTest() {
        // TODO: Implement test for decode method
    }

}
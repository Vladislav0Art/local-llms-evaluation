package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturerTest {

    @Mock
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getManufacturerTest() {
        when(watchProtocolDecoder.getManufacturer()).thenReturn("Watch");
    }

}
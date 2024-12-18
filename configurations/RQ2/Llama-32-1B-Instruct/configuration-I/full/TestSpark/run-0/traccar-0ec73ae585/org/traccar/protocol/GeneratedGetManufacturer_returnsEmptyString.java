package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer_returnsEmptyString {

    @Mock
    private Protocol protocol;

    @Test
    public void getManufacturer_returnsEmptyString() {
        // Arrange
        when(protocol.getManufacturer()).thenReturn("");

        // Act and Assert
        String result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getManufacturer();
        assertEquals("", result);
    }

}
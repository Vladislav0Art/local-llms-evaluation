package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer {

    @Mock
    private Protocol protocol;

    @Test
    public void getManufacturer() {
        // Arrange
        Protocol protocolMock = Mockito.mock(Protocol.class);
        Mockito.when(protocolMock.getManufacturer()).thenReturn("Unknown Manufacturer");

        WatchProtocolDecoderInstance watchProtocolDecoderInstance = new WatchProtocolDecoderInstance(protocolMock);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getManufacturer();

        // Assert
        assertEquals("Unknown Manufacturer", result);
    }

}
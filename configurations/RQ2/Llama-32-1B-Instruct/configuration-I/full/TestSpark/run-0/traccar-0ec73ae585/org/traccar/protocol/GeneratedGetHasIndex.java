package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex {

    @Mock
    private Protocol protocol;

    @Test
    public void getHasIndex() {
        // Arrange
        Protocol protocolMock = Mockito.mock(Protocol.class);
        Mockito.when(protocolMock.getHasIndex()).thenReturn(true);

        WatchProtocolDecoderInstance watchProtocolDecoderInstance = new WatchProtocolDecoderInstance(protocolMock);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getHasIndex();

        // Assert
        assertEquals(true, result);
    }

}
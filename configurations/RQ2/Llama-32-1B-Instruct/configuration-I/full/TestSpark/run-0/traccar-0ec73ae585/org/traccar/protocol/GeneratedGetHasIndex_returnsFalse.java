package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex_returnsFalse {

    @Mock
    private Protocol protocol;

    @Test
    public void getHasIndex_returnsFalse() {
        // Arrange
        when(protocol.getHasIndex()).thenReturn(false);

        // Act and Assert
        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getHasIndex();
        assertEquals(false, result);
    }

}
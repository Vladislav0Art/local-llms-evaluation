package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_NoExceptions {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void constructor_NoExceptions() {
        // Arrange
        Protocol protocol = new Protocol();

        // Act
        GalileoProtocolDecoder galileoProtocolDecoder = new GalileoProtocolDecoder(protocol);

        // Assert
        assert galileoProtocolDecoder != null;
    }

}
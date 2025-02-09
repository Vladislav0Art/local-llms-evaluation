package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
public class GeneratedConstructorProtocolNotNullTest {

    UnitsConverter .class,StandardCharsets .class,Date .class
})

public class GalileoProtocolDecoderTest {

    @Test
    public void constructorProtocolNotNullTest() {
        //Prepare
        Protocol protocolMock = mock(Protocol.class);

        //Act
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);

        //Assert
        assertNotNull(decoder);
        assertTrue(decoder instanceof GalileoProtocolDecoder);
    }

}
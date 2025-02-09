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
public class GeneratedDecodeSocketAddressNullTest {

    UnitsConverter .class,StandardCharsets .class,Date .class
})

public class GalileoProtocolDecoderTest {

    @Test
    public void decodeSocketAddressNullTest() throws Exception {
        //Prepare
        Protocol protocolMock = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);

        //Act
        Object result = decoder.decode(null, null, "msg");

        //Assert
        assertNull(result);
    }

}
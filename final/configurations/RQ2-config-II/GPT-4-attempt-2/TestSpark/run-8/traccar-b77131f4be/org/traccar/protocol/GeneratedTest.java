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
public class GeneratedTest {

    UnitsConverter .class,StandardCharsets .class,Date .class
})

public class GalileoProtocolDecoderTest {

    @Test
    public void decodeMessageDataTest() throws Exception {
        //Prepare
        Protocol protocolMock = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);
        SocketAddress remoteAddressMock = mock(SocketAddress.class);
        String msg = "decode_test_message";

        //Act
        Object result = decoder.decode(null, remoteAddressMock, msg);

        //Assert
        assertNotNull(result);
    }

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

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        //Prepare
        Protocol protocolMock = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);
        SocketAddress remoteAddressMock = mock(SocketAddress.class);

        //Act
        Object result = decoder.decode(null, remoteAddressMock, "");

        //Assert
        assertNull(result);
    }

    @Test
    public void constructorProtocolNullTest() {
        //Act
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);

        //Assert
        assertNotNull(decoder);
        assertTrue(decoder instanceof GalileoProtocolDecoder);
    }

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
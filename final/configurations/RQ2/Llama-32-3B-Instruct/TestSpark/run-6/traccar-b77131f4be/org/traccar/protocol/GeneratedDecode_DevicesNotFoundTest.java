package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_DevicesNotFoundTest {

    @Mock
    private Protocol protocol;

    public List<BitBuffer> decodeList() {
        return new LinkedList<>();
    }

    @Test
    public void decode_DevicesNotFoundTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object result = decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), Mockito.mock(DeviceSession.class));
        assertNull(result);
    }

}
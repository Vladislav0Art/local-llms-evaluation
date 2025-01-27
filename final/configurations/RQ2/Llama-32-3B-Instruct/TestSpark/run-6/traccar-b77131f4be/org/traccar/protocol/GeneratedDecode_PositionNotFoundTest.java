package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_PositionNotFoundTest {

    @Mock
    private Protocol protocol;

    public List<BitBuffer> decodeList() {
        return new LinkedList<>();
    }

    @Test
    public void decode_PositionNotFoundTest() throws Exception {
        when(protocol).thenReturn(this.protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);

        List<BitBuffer> result = decodeList();
        BitBuffer bitBuffer = Mockito.mock(BitBuffer.class);
        result.add(bitBuffer);
        when(protocol.decode(channel, remoteAddress)).thenReturn(result);

        Object obj = decoder.decode(channel, remoteAddress, deviceSession);
        assertNull(obj);
    }

}
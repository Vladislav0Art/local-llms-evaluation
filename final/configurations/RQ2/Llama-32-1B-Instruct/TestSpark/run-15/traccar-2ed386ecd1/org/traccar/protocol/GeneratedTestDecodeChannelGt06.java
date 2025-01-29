package org.traccar.protocol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeChannelGt06 {

    private Gt06ProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @After
    public void tearDown() {
        decoder = null;
    }

    @Test
    public void testDecodeChannelGt06() throws Exception {
        Mockito.when(Channel.buffer()).thenReturn(mockByteBuf);
        decoder.decode(ProtocolsChannel.class, null, Protocol.GT06, true, false, TimeZone.getDefault());
        verify(decoded).decode(ProtocolsChannel.class, mockSocketAddress, Protocol.GT06, true, false, TimeZone.getDefault());
    }

}
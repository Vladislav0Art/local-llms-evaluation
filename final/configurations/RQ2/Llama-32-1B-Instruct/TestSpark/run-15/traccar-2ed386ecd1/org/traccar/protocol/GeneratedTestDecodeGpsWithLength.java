package org.traccar.protocol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeGpsWithLength {

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
    public void testDecodeGpsWithLength() throws Exception {
        Mockito.when(BcdUtil.decodeByteBuf(mockByteBuf)).thenReturn(position);
        decoder.decodeChannel(null, null, Position.class, false, false, TimeZone.getDefault());
        verify(decoded).decodeChannel(mockChannel, mockSocketAddress, position, true, false, TimeZone.getDefault());
    }

}
package org.traccar.protocol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodePositionNotGt06 {

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
    public void testDecodePositionNotGt06() throws Exception {
        Mockito.when(BcdUtil.decodeByteBuf(mockByteBuf)).thenReturn(null);
        decoder.decodeChannel(null, null, null, true, false, TimeZone.getDefault());
        verify(decodedPosition).decodeChannel(mockChannel, mockSocketAddress, null, true, false, TimeZone.getDefault());
    }

}
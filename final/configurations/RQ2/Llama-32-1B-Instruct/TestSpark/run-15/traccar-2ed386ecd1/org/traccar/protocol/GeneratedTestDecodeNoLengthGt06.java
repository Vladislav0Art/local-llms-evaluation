package org.traccar.protocol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeNoLengthGt06 {

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
    public void testDecodeNoLengthGt06() throws Exception {
        Mockito.when(BcdUtil.decodeByteBuf(mockByteBuf)).thenReturn(position);
        decoder.decodeChannel(null, null, position, false, false, TimeZone.getDefault());
        verify(decoded).decodeChannel(mockChannel, mockSocketAddress, position, true, false, TimeZone.getDefault());
    }

}
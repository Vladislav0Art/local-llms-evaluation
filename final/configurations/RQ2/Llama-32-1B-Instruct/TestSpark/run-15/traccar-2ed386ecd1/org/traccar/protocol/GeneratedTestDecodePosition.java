package org.traccar.protocol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodePosition {

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
    public void testDecodePosition() throws Exception {
        Mockito.when(BcdUtil.decodeByteBuf(mockByteBuf)).thenReturn(position);
        decoder.decodeChannel(null, null, position, true, false, TimeZone.getDefault());
        verify(decodedPosition).decodeChannel(mockChannel, mockSocketAddress, position, true, false, TimeZone.getDefault());
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        assertNull(decoder.decode(null, null,
                ChannelBuffers.wrappedBuffer(ChannelBuffers.BIG_ENDIAN, BinaryParsing.base16Decoding())));
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        assertNull(decoder.decode(null,
                null, Unpooled.wrappedBuffer(ByteBufUtil.decodeHexDump(""))));
        assertNotNull(decoder.decode(null,
                null, Unpooled.wrappedBuffer(ByteBufUtil.decodeHexDump("5B33372A39303039343036303937383838362A303032332A4C4B2C30302C38352C30302C302C2C2C2C2C2C2C2C46464646464FFFFFFFF464646246D"))));
    }

}
package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetHasIndex_twoByteMessage {

    @Test
    public void getHasIndex_twoByteMessage() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(2);
        data.writeBytes(new byte[]{0x01, 0x02});
        assertTrue(decoder.getHasIndex());
    }

}
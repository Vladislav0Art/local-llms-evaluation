package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetHasIndex_singleByteMessage {

    @Test
    public void getHasIndex_singleByteMessage() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(1);
        data.writeByte((byte) 0x01);
        assertTrue(decoder.getHasIndex());
    }

}
package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetHasIndex_emptyMessage {

    @Test
    public void getHasIndex_emptyMessage() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertTrue(decoder.getHasIndex());
    }

}
package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import org.junit.Test;

public class GeneratedGetHasIndex_ReturnsFalse {

    @Test
    public void getHasIndex_ReturnsFalse() {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // When
        boolean result = decoder.getHasIndex();

        // Then
        assertFalse(result);
    }

}
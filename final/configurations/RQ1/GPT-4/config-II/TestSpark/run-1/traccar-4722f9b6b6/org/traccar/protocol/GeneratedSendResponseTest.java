package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.Protocol;
import org.traccar.Context;
import org.traccar.protocol.ProtocolDecoderTest;
import org.traccar.model.Position;
import org.traccar.helper.TestIdentityManager;
import org.traccar.model.Network;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        decoder.sendResponse(channel, "123456", "abc", "testing");
        assertEquals(decoder.getHasIndex(), true);
        assertEquals(decoder.getManufacturer(), null);
    }

}
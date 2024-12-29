package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.model.PositionTest;

import java.net.InetSocketAddress;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeInvalidMessageTest {

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo") {
            @Override
            public String getName() {
                return "galileo";
            }
        });

        assertNull(decoder.decode(null, null, null));
    }

}
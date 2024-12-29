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

public class GeneratedDecodeValidMessageTest {

    @Test
    public void decodeValidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo") {
            @Override
            public String getName() {
                return "galileo";
            }
        });

        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{0x00, 0x00, 0x01, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10});
        Object decodedObject = decoder.decode(null, null, buf);

        assertTrue(decodedObject instanceof Position);

        Position position = (Position) decodedObject;
        PositionTest.assertPosition(position);
    }

}
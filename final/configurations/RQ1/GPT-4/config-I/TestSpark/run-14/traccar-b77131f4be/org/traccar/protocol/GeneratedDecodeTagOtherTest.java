package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTagOtherTest {

    @Test
    public void decodeTagOtherTest() {
        GalileoProtocolDecoder protocolDecoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeIntLE((int) (System.currentTimeMillis() / 1000));

        Position position = new Position("galileo");
        protocolDecoder.decodeTagOther(position, buffer, 0x20);

        assertNotNull(position.getFixTime());
    }

}
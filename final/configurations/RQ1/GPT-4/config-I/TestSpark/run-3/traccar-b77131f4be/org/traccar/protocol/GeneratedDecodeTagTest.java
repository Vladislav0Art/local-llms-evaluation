package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.awaitility.Awaitility;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(56);
        new GalileoProtocolDecoder(mock(Protocol.class)).decodeTag(position, buf, 0x50);
        Map<String, Object> map = position.getAttributes();
        map.containsKey("adc0");
    }

}
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

public class GeneratedGetTagLengthKnownTagTest {

    @Test
    public void getTagLengthKnownTagTest() {
        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(0x01, 1);
        testMap.put(0x04, 2);
        testMap.put(0x63, 3);
        testMap.put(0x33, 4);
        testMap.put(0x5b, 7);
        testMap.put(0x5c, 68);
        testMap.put(0xfd, 8);
        testMap.put(0xfe, 8);

        for (Map.Entry<Integer, Integer> entry : testMap.entrySet()) {
            assertEquals(entry.getValue().intValue(), GalileoProtocolDecoder.getTagLength(entry.getKey().intValue()));
        }
    }

}
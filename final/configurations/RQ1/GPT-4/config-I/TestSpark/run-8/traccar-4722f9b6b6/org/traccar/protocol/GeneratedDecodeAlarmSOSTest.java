package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import io.netty.channel.Channel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmSOSTest {

    private WatchProtocolDecoder decoder;
    private Position position;

    @Before
    public void init() {
        Protocol protocol = new Protocol("watch") {
        };
        decoder = new WatchProtocolDecoder(protocol);
        position = new Position();
        position.setProtocol("watch");
    }

    @Test
    public void decodeAlarmSOSTest() throws Exception {
        ByteBuf byteBuf = Unpooled.copiedBuffer(
                "[SG*864180032969632*0002*AL]", StandardCharsets.US_ASCII);
        assertEquals("SG*864180032969632*0002*AL", decoder.decode(null, null, byteBuf));
    }

}
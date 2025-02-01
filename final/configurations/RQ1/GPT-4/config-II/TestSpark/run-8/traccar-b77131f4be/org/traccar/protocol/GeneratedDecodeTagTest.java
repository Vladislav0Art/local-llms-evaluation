package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buf = mock(ByteBuf.class);
        Position position = mock(Position.class);
        decoder.decodeTag(position, buf, 0xa0);
    }

}
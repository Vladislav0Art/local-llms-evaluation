package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedGetTagLengthUnknownTagTest {

    @Test
    public void getTagLengthUnknownTagTest() {
        GalileoProtocolDecoder.getTagLength(0x99);
    }

}
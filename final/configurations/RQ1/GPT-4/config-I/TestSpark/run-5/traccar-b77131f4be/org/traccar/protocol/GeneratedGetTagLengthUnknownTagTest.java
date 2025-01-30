package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetTagLengthUnknownTagTest {

    private final Protocol protocol = new Protocol("test", "");
    private final GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
    private static final int HEADER_POSITIONS = 0x01;
    private static final int HEADER_PHOTO = 0x07;
    private static final int HEADER_COMPRESSED_POSITIONS = 0x08;

    @Test
    public void getTagLengthUnknownTagTest() {
        GalileoProtocolDecoder.getTagLength(0x00);
    }

}
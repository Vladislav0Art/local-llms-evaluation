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

public class GeneratedGetTagLengthKnownTagTest {

    @Test
    public void getTagLengthKnownTagTest() {
        assertEquals(1, GalileoProtocolDecoder.getTagLength(0x01));
    }

}
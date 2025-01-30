package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTagLengthUnknownTagTest {

    @Test
    public void getTagLengthUnknownTagTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GalileoProtocolDecoder.getTagLength(0xAA);
        });

        assertEquals("Unknown tag: 0x" + Integer.toHexString(0xAA), exception.getMessage());
    }

}
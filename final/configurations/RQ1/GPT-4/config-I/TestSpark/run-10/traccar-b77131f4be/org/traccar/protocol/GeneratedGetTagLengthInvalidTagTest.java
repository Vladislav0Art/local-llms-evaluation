package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.Protocol;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTagLengthInvalidTagTest {

    @Test
    public void getTagLengthInvalidTagTest() {
        try {
            GalileoProtocolDecoder.getTagLength(0x99); // invalid tag
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException iae) {
            assertTrue(true);
        }
    }

}
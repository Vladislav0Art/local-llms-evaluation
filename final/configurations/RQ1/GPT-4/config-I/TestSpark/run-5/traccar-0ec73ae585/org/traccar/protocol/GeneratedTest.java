package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.util.Date;

public class GeneratedTest {

    @Test
    public void testDecodeTypeUDTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test"));

        Object result = decoder.decode(
                channel,
                remoteAddress,
                Unpooled.wrappedBuffer(
                        "[SG*9051000198*0065*UD,240317,072511,A,51.480494,E,0.186771,0.00,0,0,0,4,240317074405,258,01,0002,526B,0]"
                                .getBytes(StandardCharsets.US_ASCII)));
        if (result instanceof Position) {
            Position position = (Position) result;
            assertEquals(47029494, position.getLatitude(), 0.00001);
            assertEquals(186771, position.getLongitude(), 0.00001);
            assertEquals(0.00, position.getSpeed(), 0.00001);
            assertEquals(0.00, position.getCourse(), 0.00001);
        } else {
            fail("Result is not instance of Position class");
        }
    }

}
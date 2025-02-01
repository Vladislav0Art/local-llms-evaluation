package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Device;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    private static final String FULL_SAMPLE_MESSAGE = "[3G*3300245504*0006*LK,70,1,2]";
    private static final String POSITION_MESSAGE = "0A01402F,131615,A,2234.2799,N,11352.6700,E,0.00,0,0,7,66,98,100,0,14002091d057;ATL:460,00,1820,1697,-87;WIFI:JMNN,88:25:93:89:75:08,-78|MERCURY_DBA0,78:44:76:3f:db:a0,-64,";

    @Test
    public void decodeTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.copiedBuffer(FULL_SAMPLE_MESSAGE, StandardCharsets.US_ASCII);

        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // check if the decode method returns a Position object
        assertTrue(watchProtocolDecoder.decode(channel, remoteAddress, buf) instanceof Position);
    }

}
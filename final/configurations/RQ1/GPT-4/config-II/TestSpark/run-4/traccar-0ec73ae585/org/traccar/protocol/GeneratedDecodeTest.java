package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.helper.Parser;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Base64;

import static org.mockito.Mockito.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        String obj = "[3G*8800001234*0088*UD,230621151530,A,37.983810,23.727539,E,0,0,10,7,100,0,B9FE,E3,aabbccdd,255,-95dd]";
        ByteBuf buf = Unpooled.wrappedBuffer(obj.getBytes(StandardCharsets.US_ASCII));
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        decoder.decode(channel, remoteAddress, buf);
        Assert.assertEquals(decoder.getHasIndex(), true);
        Assert.assertEquals(decoder.getManufacturer(), "3G");
    }

}
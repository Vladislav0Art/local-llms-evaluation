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

public class GeneratedDecodeTestImage {

    @Test
    public void decodeTestImage() throws Exception {
        String image = Base64.getEncoder().encodeToString("test image".getBytes());
        String imgObj = "[3G*8800001234*0036*img,001,001,230621151530*" + image + "=?";
        ByteBuf buf = Unpooled.wrappedBuffer(imgObj.getBytes(StandardCharsets.US_ASCII));
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));

        Position position = (Position) decoder.decode(channel, remoteAddress, buf);
        Assert.assertEquals(position.getProtocol(), "watchProtocol");
    }

}
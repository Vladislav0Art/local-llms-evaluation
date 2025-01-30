package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.DatagramPacket;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.Protocol;
import org.traccar.Helper;

import java.net.InetSocketAddress;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        byte[] buf1 = ByteBufUtil.decodeHexDump("5B4F4B2A4C4B2923");
        Assert.assertEquals(decoder.decode(null, null, Unpooled.wrappedBuffer(buf1)), null);

        byte[] buf2 = ByteBufUtil.decodeHexDump("5B3335303833373036343330353234335F3B48412A33353332303131323135343833362C56312C3032313231352C412C313233312E313930382C4E2C31303732332E333634362C572C3030302E30302C3030302E30302C30302C342E382C372C31372C37302C302C30303834312C3433392C343430392C343434312C3430135D23");
        Position position = (Position) decoder.decode(null, null, Unpooled.wrappedBuffer(buf2));
        Assert.assertNotNull(position);
        Assert.assertEquals(position.getLong(Position.KEY_BATTERY_LEVEL), new Long(70));
    }

}
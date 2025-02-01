package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedGetManufacturerBeforeDecodeTest {

    @Test
    public void getManufacturerBeforeDecodeTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Assert.assertNull(decoder.getManufacturer());
    }

}
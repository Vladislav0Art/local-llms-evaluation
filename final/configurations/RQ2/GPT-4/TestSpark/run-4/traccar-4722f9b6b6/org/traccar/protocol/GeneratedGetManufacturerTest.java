package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocol;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        String result = decoder.getManufacturer();

        Assert.assertNotNull(result);
    }

}
package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedGetManufacturerEmptyConstructorTest {

    private static final String HEX_MESSAGE = "1a2b3c4d5e6f";
    private static final String EXPECTED_STRING = "123456";

    @Test
    public void getManufacturerEmptyConstructorTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol(""));
        Assert.assertNull(watchProtocolDecoder.getManufacturer());
    }

}
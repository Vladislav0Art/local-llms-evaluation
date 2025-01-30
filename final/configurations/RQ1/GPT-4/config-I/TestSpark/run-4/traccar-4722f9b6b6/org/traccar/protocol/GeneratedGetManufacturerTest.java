package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.SocketAddress;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        String manufacturer = decoder.getManufacturer();
        Assert.assertNull(manufacturer);
    }

}
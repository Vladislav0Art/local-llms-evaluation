package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturerTest {

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*0030*LK,0,100,0,100]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(null, socketAddress, buf);
        assertEquals("3G", decoder.getManufacturer());
    }

}
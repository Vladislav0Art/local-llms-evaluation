package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.WatchProtocol;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedGetManufacturerTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

    @Test
    public void getManufacturerTest() {
        String manufacturer = decoder.getManufacturer();
        assertEquals("unknown", manufacturer);
    }

}
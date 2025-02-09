package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import static org.junit.Assert.*;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol("test") {
        };
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        String manufacturer = watchProtocolDecoder.getManufacturer();
        assertNull(manufacturer);
    }

}
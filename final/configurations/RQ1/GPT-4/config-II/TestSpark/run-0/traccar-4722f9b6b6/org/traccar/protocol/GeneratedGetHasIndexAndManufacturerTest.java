package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedGetHasIndexAndManufacturerTest {

    @Test
    public void GetHasIndexAndManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals(false, decoder.getHasIndex());
        assertNull(decoder.getManufacturer());
    }

}
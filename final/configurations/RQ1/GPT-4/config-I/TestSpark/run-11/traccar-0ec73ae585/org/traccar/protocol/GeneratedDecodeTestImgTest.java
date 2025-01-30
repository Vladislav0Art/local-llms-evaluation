package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;

public class GeneratedDecodeTestImgTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0));

    @Test
    public void decodeTestImgTest() throws Exception {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 0);
        assertEquals(null, decoder.decode(null, address, "10*4700189191*0009*IMG,200919,180801,02,(dta_start:02)"));
    }

}
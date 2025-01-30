package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;

public class GeneratedDecodeTKTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0));

    @Test
    public void decodeTKTest() throws Exception {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 0);
        assertEquals(null, decoder.decode(null, address, "07*89860187800005643017*0012*TK,AMR,0001,5,3,200L,End_JX"));
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.net.InetSocketAddress;
import java.net.ProtocolException;

public class GeneratedDecodeNullMsgTest {

    @Test
    public void decodeNullMsgTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        InetSocketAddress remoteAddress = InetSocketAddress.createUnresolved("123.123.123.123", 5555);

        decoder.decode(null, remoteAddress, null);
    }

}
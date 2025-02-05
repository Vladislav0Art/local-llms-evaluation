package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;

import java.net.InetSocketAddress;

public class GeneratedGetHasIndexNullTest {

    @Test
    public void getHasIndexNullTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

}
package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedGetHasIndexDefaultValueTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getHasIndexDefaultValueTest() {
        assertFalse(decoder.getHasIndex());
    }

}
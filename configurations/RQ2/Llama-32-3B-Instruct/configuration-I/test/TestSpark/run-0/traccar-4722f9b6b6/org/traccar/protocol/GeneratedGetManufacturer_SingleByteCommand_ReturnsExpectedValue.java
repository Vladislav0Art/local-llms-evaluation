package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedGetManufacturer_SingleByteCommand_ReturnsExpectedValue {

    @Test
    public void getManufacturer_SingleByteCommand_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new SingleByteMessage('1');
        assertEquals("Manufacturer 1", decoder.getManufacturer(channel, remoteAddress, msg));
    }

}
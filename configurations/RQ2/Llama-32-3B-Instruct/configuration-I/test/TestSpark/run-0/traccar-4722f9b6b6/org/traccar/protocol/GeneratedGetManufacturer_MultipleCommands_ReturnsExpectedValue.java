package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedGetManufacturer_MultipleCommands_ReturnsExpectedValue {

    @Test
    public void getManufacturer_MultipleCommands_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new MultipleByteMessage((byte) '1', (byte) '2', (byte) '3', (byte) '4');
        assertEquals("Manufacturer 1234", decoder.getManufacturer(channel, remoteAddress, msg));
    }

}
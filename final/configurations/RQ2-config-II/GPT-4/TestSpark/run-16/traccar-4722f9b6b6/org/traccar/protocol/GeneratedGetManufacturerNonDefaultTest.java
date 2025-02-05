package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.Session;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedGetManufacturerNonDefaultTest {

    @Test
    public void getManufacturerNonDefaultTest() {
        Protocol protocol = new Protocol("watch") {
            @Override
            public String getManufacturer() {
                return "TestManufacturer";
            }
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("TestManufacturer", decoder.getManufacturer());
    }

}
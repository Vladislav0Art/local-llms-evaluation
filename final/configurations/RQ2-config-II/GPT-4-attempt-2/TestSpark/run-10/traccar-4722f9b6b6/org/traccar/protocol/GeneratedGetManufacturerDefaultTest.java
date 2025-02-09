package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturerDefaultTest {

    @Test
    public void getManufacturerDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertNull(decoder.getManufacturer());
    }

}
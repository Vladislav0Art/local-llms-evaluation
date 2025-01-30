package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;

import io.netty.channel.Channel;

public class GeneratedGetManufacturerTest {

    @Mock
    private SocketAddress remoteAddress;
    @Mock
    private ByteBuf buf;
    private DeviceSession deviceSession;

    private WatchProtocolDecoder getDecoder() throws NoSuchFieldException, IllegalAccessException {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new StubProtocol());
        return decoder;
    }

    @Test
    public void getManufacturerTest() throws IllegalAccessException, NoSuchFieldException {
        WatchProtocolDecoder decoder = getDecoder();
        Assert.assertNull(decoder.getManufacturer());
    }

    private class StubProtocol extends Protocol {

        private StubProtocol() {
            super("test");
        }

        @Override
        protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) {
            return null;
        }
    }

}
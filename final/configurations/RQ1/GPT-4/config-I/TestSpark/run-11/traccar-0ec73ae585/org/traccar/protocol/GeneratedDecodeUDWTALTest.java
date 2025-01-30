package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.net.InetSocketAddress;

import static org.junit.Assert.*;

public class GeneratedDecodeUDWTALTest {

    private WatchProtocolDecoder decoder;

    public WatchProtocolDecoderTest() throws Exception {
        Class<?> protocolClass = Class.forName("org.traccar.protocol.Protocol");
        Constructor<?> protocolConstructor = protocolClass.getDeclaredConstructor(String.class, Integer.TYPE);
        protocolConstructor.setAccessible(true);
        Object protocol = protocolConstructor.newInstance("watch", 0);
        decoder = new WatchProtocolDecoder((org.traccar.Protocol) protocol);
    }

    @Test
    public void decodeUDWTALTest() throws Exception {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 0);
        assertEquals(null, decoder.decode(null, address,
                "[CS*123456789012345*UD,230615,A,6000.0000,N,6000.0000,E,000.0,000,0.0,F,204,01,0C1F,3A64]"));
    }

}
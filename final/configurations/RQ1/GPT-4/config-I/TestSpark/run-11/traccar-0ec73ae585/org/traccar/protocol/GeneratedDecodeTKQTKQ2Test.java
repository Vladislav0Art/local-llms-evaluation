package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.net.InetSocketAddress;

import static org.junit.Assert.*;

public class GeneratedDecodeTKQTKQ2Test {

    private WatchProtocolDecoder decoder;

    public WatchProtocolDecoderTest() throws Exception {
        Class<?> protocolClass = Class.forName("org.traccar.protocol.Protocol");
        Constructor<?> protocolConstructor = protocolClass.getDeclaredConstructor(String.class, Integer.TYPE);
        protocolConstructor.setAccessible(true);
        Object protocol = protocolConstructor.newInstance("watch", 0);
        decoder = new WatchProtocolDecoder((org.traccar.Protocol) protocol);
    }

    @Test
    public void decodeTKQTKQ2Test() throws Exception {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 0);
        assertEquals(null, decoder.decode(null, address, "[3G*4700189114*0009*VERON1234]"));
    }

}
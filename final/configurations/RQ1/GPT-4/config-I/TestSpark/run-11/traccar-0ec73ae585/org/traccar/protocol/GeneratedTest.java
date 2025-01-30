package org.traccar.protocol;

import org.junit.Before;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.net.InetSocketAddress;

import static org.junit.Assert.*;

public class GeneratedTest {

    private WatchProtocolDecoder decoder;

    @Before
    public void setup() throws Exception {
        Class<?> protocolClass = Class.forName("org.traccar.protocol.Protocol");
        Constructor<?> protocolConstructor = protocolClass.getDeclaredConstructor(String.class, Integer.TYPE);
        protocolConstructor.setAccessible(true);
        Object protocol = protocolConstructor.newInstance("watch", 0);
        decoder = new WatchProtocolDecoder((org.traccar.Protocol) protocol);
    }

}
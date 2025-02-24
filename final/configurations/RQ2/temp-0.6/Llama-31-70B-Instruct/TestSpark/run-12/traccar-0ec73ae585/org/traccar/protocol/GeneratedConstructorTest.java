package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

import javax.annotation.Nullable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexDefaultTest {

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

}
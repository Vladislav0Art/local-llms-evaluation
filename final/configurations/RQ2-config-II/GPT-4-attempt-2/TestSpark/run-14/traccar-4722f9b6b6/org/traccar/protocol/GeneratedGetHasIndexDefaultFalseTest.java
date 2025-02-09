package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexDefaultFalseTest {

    @Test
    public void getHasIndexDefaultFalseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertFalse(decoder.getHasIndex());
    }

}
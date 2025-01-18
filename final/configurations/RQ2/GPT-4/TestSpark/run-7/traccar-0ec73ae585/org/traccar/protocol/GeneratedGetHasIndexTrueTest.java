package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.Helper;

import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexTrueTest {

    @Test
    public void getHasIndexTrueTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertTrue(decoder.getHasIndex());
    }

}
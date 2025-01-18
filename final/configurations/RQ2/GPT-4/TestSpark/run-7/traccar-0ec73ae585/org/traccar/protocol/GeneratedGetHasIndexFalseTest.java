package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.Helper;

import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexFalseTest {

    @Test
    public void getHasIndexFalseTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

}
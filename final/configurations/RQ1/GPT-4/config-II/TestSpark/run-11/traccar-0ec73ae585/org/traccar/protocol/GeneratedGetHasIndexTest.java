package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.*;

import java.lang.reflect.Method;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertEquals(false, decoder.getHasIndex());
    }

}
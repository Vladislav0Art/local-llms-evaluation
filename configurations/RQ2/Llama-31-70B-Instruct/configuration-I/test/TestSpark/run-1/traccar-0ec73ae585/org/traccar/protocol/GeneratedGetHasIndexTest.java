package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertTrue(watchProtocolDecoder.getHasIndex());
    }

}
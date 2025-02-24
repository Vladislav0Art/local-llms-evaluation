package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testDecodeWithoutIndex() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mock(Protocol.class));
        assertFalse(decoder.getHasIndex());
    }

}
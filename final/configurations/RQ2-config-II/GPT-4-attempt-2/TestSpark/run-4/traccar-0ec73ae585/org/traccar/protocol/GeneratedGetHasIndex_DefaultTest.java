package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedGetHasIndex_DefaultTest {

    @Test
    public void getHasIndex_DefaultTest() {
        Protocol protocolMock = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);

        boolean defaultHasIndex = decoder.getHasIndex();

        assertEquals(false, defaultHasIndex); // assuming false is the default value
    }

}
package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWatchProtocolDecoderCreationTest {

    @Test
    public void WatchProtocolDecoderCreationTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(decoder.getProtocol(), protocol);
    }

}
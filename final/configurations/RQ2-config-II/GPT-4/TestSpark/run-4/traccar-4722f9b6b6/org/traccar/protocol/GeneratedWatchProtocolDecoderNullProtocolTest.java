package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.model.Protocol;
import org.traccar.ProtocolDecoder;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWatchProtocolDecoderNullProtocolTest {

    @Test
    public void WatchProtocolDecoderNullProtocolTest() {
        Protocol protocol = null;
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        assertNotNull(watchProtocolDecoder);
    }

}
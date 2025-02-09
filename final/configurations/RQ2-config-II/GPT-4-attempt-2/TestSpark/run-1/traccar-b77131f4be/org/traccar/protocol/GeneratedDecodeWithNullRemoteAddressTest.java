package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.TestDataManager;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithNullRemoteAddressTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Position position;

    @Test
    public void decodeWithNullRemoteAddressTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        Object msg = "other message";
        decoder.decode(channel, null, msg);
        verifyZeroInteractions(channel);
    }

}
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
public class GeneratedDecodeWithNullChannelTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Position position;

    @Test
    public void decodeWithNullChannelTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "some message";
        decoder.decode(null, remoteAddress, msg);
        verifyZeroInteractions(remoteAddress);
    }

}
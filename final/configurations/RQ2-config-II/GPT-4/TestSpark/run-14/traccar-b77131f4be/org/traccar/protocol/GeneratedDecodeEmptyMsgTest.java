package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeEmptyMsgTest {

    @Mock
    private Protocol protocolMock;

    @Mock
    private Channel channelMock;

    @Mock
    private DeviceSession deviceSessionMock;

    @Test
    public void decodeEmptyMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);
        String emptyMessage = "";
        decoder.decode(channelMock, null, emptyMessage);
        verify(protocolMock).decode(anyObject(), anyObject(), anyObject());
    }

}
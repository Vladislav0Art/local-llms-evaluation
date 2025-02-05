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
public class GeneratedTest {

    @Mock
    private Protocol protocolMock;

    @Mock
    private Channel channelMock;

    @Mock
    private DeviceSession deviceSessionMock;

    @Test
    public void decodeValidMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);
        String validMessage = "Valid Message Content";
        decoder.decode(channelMock, null, validMessage);
        verify(protocolMock).decode(anyObject(), anyObject(), anyObject());
    }

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);
        String invalidMessage = "Invalid Message Content";
        decoder.decode(channelMock, null, invalidMessage);
    }

    @Test
    public void decodeNullMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);
        decoder.decode(channelMock, null, null);
        verify(protocolMock).decode(anyObject(), anyObject(), anyObject());
    }

    @Test
    public void decodeEmptyMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocolMock);
        String emptyMessage = "";
        decoder.decode(channelMock, null, emptyMessage);
        verify(protocolMock).decode(anyObject(), anyObject(), anyObject());
    }

    @Test
    public void GalileoProtocolDecoderValidProtocolTest() {
        new GalileoProtocolDecoder(protocolMock);
        verify(protocolMock).getName();
    }

    @Test
    public void GalileoProtocolDecoderNullProtocolTest() {
        new GalileoProtocolDecoder(null);
    }

}
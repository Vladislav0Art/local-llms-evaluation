package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_ChannelShouldNotBeNullWhenDecodeMethodIsCalled {

    @Test
    public void decode_ChannelShouldNotBeNullWhenDecodeMethodIsCalled() {
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = new Object();

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Object decodedMsg = decoder.decode(channel, remoteAddress, msg);

        assertNotNull(decodedMsg);
    }

}
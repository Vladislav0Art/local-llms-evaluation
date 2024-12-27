package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_WithNullChannelShouldThrowException {

    @Test
    public void decode_WithNullChannelShouldThrowException() {
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = new Object();

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        assertThrows(Exception.class, () -> decoder.decode(channel, remoteAddress, msg));
    }

}
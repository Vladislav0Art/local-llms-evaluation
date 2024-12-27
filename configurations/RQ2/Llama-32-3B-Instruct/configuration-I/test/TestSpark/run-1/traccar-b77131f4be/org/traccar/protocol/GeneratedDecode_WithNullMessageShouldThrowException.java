package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_WithNullMessageShouldThrowException {

    @Test
    public void decode_WithNullMessageShouldThrowException() {
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = null;

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        assertThrows(Exception.class, () -> decoder.decode(channel, remoteAddress, msg));
    }

}
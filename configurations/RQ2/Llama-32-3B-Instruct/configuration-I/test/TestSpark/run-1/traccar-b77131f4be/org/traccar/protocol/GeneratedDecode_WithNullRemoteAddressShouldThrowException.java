package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_WithNullRemoteAddressShouldThrowException {

    @Test
    public void decode_WithNullRemoteAddressShouldThrowException() {
        Channel channel = new Channel();
        SocketAddress remoteAddress = null;
        Object msg = new Object();

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        assertThrows(Exception.class, () -> decoder.decode(channel, remoteAddress, msg));
    }

}
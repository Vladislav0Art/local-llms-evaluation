package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_WithEmptyMessageShouldReturnEmptyString {

    @Test
    public void decode_WithEmptyMessageShouldReturnEmptyString() {
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = "";

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        String decodedMsg = decoder.decode(channel, remoteAddress, msg).toString();

        assertEquals("", decodedMsg);
    }

}
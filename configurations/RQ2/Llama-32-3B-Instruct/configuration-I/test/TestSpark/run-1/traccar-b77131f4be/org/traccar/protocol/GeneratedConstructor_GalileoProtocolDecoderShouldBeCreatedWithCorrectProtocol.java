package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConstructor_GalileoProtocolDecoderShouldBeCreatedWithCorrectProtocol {

    @Test
    public void constructor_GalileoProtocolDecoderShouldBeCreatedWithCorrectProtocol() {
        Protocol protocol = Mockito.mock(Protocol.class);
        assertEquals(protocol, new GalileoProtocolDecoder(protocol).getProtocol());
    }

}
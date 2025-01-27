package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_GalileoProtocolDecoderTest {

    @Mock
    private Protocol protocol;

    public List<BitBuffer> decodeList() {
        return new LinkedList<>();
    }

    @Test
    public void constructor_GalileoProtocolDecoderTest() {
        when(protocol).thenReturn(this.protocol);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

}
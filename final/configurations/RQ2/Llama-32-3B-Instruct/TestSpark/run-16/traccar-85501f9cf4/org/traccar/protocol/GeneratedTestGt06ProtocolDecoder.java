package org.traccar.protocol;

import org.hamcrest.Matchers;
import org.junit.Test;

public class GeneratedTestGt06ProtocolDecoder {

    @Test
    public void testGt06ProtocolDecoder() {
        Channel channelMock = new Channel();
        Addressable addressableMock = new Addressable();

        Gt06ProtocolDecoder decoderMock = new Gt06ProtocolDecoder() {
            @Override
            public boolean decode(Channel channel, Addressable addressable, Object obj) {
                return true;
            }
        };

        org.junit.Assert.assertTrue(decoderMock.decode(channelMock, addressableMock, null));
    }

    class Channel {
    }

    class Addressable {
    }

}
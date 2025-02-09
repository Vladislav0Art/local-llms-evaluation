package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeNullInputTest {

    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));

    // Testing decode() valid input

    @Test
    public void decodeNullInputTest() throws Exception {
        decoder.decode(null, null, null);
    }

}
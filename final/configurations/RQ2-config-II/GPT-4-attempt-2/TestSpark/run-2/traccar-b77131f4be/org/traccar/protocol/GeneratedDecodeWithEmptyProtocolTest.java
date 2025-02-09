package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeWithEmptyProtocolTest {

    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));

    // Testing decode() valid input

    @Test
    public void decodeWithEmptyProtocolTest() throws Exception {
        dec = new GalileoProtocolDecoder(new Protocol(""));
        dec.decode(null, null, "<someValidMessage>");
    }

}
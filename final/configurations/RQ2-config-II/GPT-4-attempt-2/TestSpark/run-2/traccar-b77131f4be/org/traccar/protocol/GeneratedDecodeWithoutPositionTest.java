package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeWithoutPositionTest {

    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));

    // Testing decode() valid input

    @Test
    public void decodeWithoutPositionTest() throws Exception {
        String inputMessage = "<validMessageWithoutPosition>";
        decoder.decode(null, null, inputMessage);
    }

}
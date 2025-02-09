package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeWithPositionTest {

    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));

    // Testing decode() valid input

    @Test
    public void decodeWithPositionTest() throws Exception {
        String inputMessage = "<validMessageWithPosition>";
        Object result = decoder.decode(null, null, inputMessage);
        Assert.assertTrue(result instanceof Position);
    }

}
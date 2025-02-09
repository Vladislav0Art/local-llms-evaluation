package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeValidInputTest {

    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));

    // Testing decode() valid input

    @Test
    public void decodeValidInputTest() throws Exception {
        Object result = decoder.decode(null, null, "TestMessage");
        Assert.assertNotNull(result);
    }

}
package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedTest {

    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("Galileo"));

    // Testing decode() valid input

    @Test
    public void decodeValidInputTest() throws Exception {
        Object result = decoder.decode(null, null, "TestMessage");
        Assert.assertNotNull(result);
    }

    @Test
    public void decodeNullInputTest() throws Exception {
        decoder.decode(null, null, null);
    }

    @Test
    public void decodeInvalidFormatTest() throws Exception {
        decoder.decode(null, null, "<InvalidFormat>");
    }

    @Test
    public void decodeWithPositionTest() throws Exception {
        String inputMessage = "<validMessageWithPosition>";
        Object result = decoder.decode(null, null, inputMessage);
        Assert.assertTrue(result instanceof Position);
    }

    @Test
    public void decodeWithoutPositionTest() throws Exception {
        String inputMessage = "<validMessageWithoutPosition>";
        decoder.decode(null, null, inputMessage);
    }

    @Test
    public void decodeWithEmptyProtocolTest() throws Exception {
        dec = new GalileoProtocolDecoder(new Protocol(""));
        dec.decode(null, null, "<someValidMessage>");
    }

}
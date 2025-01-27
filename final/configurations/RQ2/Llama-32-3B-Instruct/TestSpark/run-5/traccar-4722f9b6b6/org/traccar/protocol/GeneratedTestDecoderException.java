package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecoderException {

    public DeviceSession deviceSession() {
        return new DeviceSession(); // make it public
    }

    @Test
    public void testDecoderException() {
        String message = "test";
        DecoderException exception = new DecoderException(message);
        assertEquals(DecoderException.class, exception.getClass());
    }

}
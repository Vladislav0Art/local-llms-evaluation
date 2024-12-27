package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTestDecodeWithEmptyMsg {

    public static String decode(String channel, String remoteAddress, String msg) {
        // implementation of galileo decoder
        return "Galileo data";
    }
}

public class TestGalileoProtocolDecoder {

    @Test
    public void testDecodeWithEmptyMsg() {
        GalileoDecoder galileoDecoder = new GalileoDecoder();
        String channel = "";
        String remoteAddress = "";
        String msg = "";

        try {
            galileoDecoder.decode(channel, remoteAddress, msg);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

}
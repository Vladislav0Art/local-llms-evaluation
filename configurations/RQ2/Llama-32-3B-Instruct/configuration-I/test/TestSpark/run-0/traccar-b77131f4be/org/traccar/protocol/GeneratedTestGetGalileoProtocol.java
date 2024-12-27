package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTestGetGalileoProtocol {

    private byte[] galileoData = new byte[0];

    public void setGalileoData(byte[] data) {
        this.galileoData = data;
    }

    public String getGalileoProtocol() {
        return "Galileo Protocol: " + java.util.Arrays.toString(galileoData);
    }
}

public class TestGalileoProtocolDecoder {

    private GalileoDecoder galileoDecoder;

    @Before
    public void setup() {
        galileoDecoder = new GalileoDecoder();
    }

    @Test
    public void testGetGalileoProtocol() {
        byte[] data = {1, 2, 3, 4, 5};
        galileoDecoder.setGalileoData(data);
        assertEquals("Galileo Protocol: [B@7d2e8fba]", galileoDecoder.getGalileoProtocol());
    }

}
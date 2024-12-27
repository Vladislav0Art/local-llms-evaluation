package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTestGetGalileoProtocolEmptyData {

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
    public void testGetGalileoProtocolEmptyData() {
        galileoDecoder.setGalileoData(new byte[0]);
        galileoDecoder.getGalileoProtocol();
    }

}
package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedInit_ThrowsExceptionWhenRgbAsHexIsSetToFalse {

    @Test
    public void init_ThrowsExceptionWhenRgbAsHexIsSetToFalse() {
        // given
        Map<String, String> options = Map.of("indent", "4");
        ConfigurationSource cfg = null;
        cssFormatter.init(options, cfg);
        cssFormatter.setRgbAsHex(false);

        // when
        boolean rgbAsHex = cssFormatter.getRgbAsHex();

        // then
        assertFalse(rgbAsHex);
    }

}
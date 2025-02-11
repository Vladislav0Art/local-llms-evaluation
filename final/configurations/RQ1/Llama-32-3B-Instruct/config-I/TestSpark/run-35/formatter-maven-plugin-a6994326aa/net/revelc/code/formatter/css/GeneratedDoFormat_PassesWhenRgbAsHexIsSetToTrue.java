package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedDoFormat_PassesWhenRgbAsHexIsSetToTrue {

    @Test
    public void doFormat_PassesWhenRgbAsHexIsSetToTrue() {
        // given
        String code = "body { color: red; }";
        LineEnding ending = null;
        cssFormatter.setRgbAsHex(true);

        // when
        String formattedCode = cssFormatter.doFormat(code, ending);

        // then
        assertNotNull(formattedCode);
    }

}
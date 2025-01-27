package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.io.IOException;

import org.w3c.css.sac.InputSource;

public class GeneratedDoFormat_WritesCssWithoutLineEnding {

    @Test
    public void doFormat_WritesCssWithoutLineEnding() throws IOException {
        String code = "body { color: #fff; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        ByteArrayInputStream input = new ByteArrayInputStream(code.getBytes());
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        String output = formatter.doFormat(new InputSource(input), ending);
        assertEquals(code, output);
    }

}
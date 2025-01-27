package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.ByteArrayInputStream;

import com.steadystate.css.sac.InputSource;

public class GeneratedDoFormatNoInput {

    @Test
    public void doFormatNoInput() throws IOException {
        CssFormatter formatter = new CssFormatter();
        InputSource input = new InputSource(new ByteArrayInputStream("".getBytes()));
        assertEquals("", formatter.doFormat(input));
    }

}
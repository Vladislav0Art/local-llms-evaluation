package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatInvalidCodeTest {

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        String code = "body {font-size: 14px;";
        CssFormatter formatter = new CssFormatter();
        LineEnding ending = LineEnding.AUTO;

        formatter.doFormat(code, ending);
    }

}
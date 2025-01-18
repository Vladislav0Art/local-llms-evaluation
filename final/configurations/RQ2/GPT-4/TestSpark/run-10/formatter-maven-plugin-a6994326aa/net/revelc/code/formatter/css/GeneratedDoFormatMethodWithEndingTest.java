package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.Mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatMethodWithEndingTest {

    @Mock
    ConfigurationSource configurationSource;

    @Test
    public void doFormatMethodWithEndingTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = ".class {color: red;}";
        LineEnding ending = LineEnding.AUTO;
        String result = cssFormatter.doFormat(code, ending);
        assertNotNull(result);
        assertNotEquals(code, result);
    }

}
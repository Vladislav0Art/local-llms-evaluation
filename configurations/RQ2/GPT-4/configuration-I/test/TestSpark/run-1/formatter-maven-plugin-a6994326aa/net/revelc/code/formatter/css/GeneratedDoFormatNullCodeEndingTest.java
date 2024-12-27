package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatNullCodeEndingTest {

    @Test
    public void doFormatNullCodeEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat(null, LineEnding.AUTO);
    }

}
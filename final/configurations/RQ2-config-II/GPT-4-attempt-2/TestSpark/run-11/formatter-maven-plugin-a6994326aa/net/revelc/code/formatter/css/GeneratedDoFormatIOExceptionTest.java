package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatIOExceptionTest {

    @Test
    public void doFormatIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(null, LineEnding.AUTO);
    }

}
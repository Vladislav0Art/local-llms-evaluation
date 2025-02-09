package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedDoFormatNullCodeTest {

    @Test
    public void doFormatNullCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(null, LineEnding.AUTO);
    }

}
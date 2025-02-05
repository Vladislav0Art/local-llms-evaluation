package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatBrokenCssTest {

    @Test
    public void doFormatBrokenCssTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String brokenCode = "body { color: blue ";    // Missing closing brace

        formatter.doFormat(brokenCode, LineEnding.AUTO);
    }

}
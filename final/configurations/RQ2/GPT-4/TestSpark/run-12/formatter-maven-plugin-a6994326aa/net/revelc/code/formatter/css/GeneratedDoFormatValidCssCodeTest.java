package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatValidCssCodeTest {

    @Test
    public void doFormatValidCssCodeTest() throws IOException {
        Map<String, String> options = new HashMap<>();
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        String formattedCode = cssFormatter.doFormat("body{background-color:#ffffff;}", LineEnding.LF);

        Assert.assertTrue(formattedCode.contains("body"));
    }

}
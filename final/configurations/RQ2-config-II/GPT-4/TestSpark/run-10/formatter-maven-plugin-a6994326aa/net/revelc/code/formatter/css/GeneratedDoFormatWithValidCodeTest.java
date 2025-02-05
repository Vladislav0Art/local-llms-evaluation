package net.revelc.code.formatter.css;

import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatWithValidCodeTest {

    @Test
    public void doFormatWithValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {color: black; }";
        String result = cssFormatter.doFormat(code, LineEnding.AUTO);
        Assert.assertEquals(code, result);
    }

}
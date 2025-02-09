package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "any string";
        LineEnding ending = LineEnding.LF;
        Assert.assertNotNull(cssFormatter.doFormat(code, ending));
    }

}
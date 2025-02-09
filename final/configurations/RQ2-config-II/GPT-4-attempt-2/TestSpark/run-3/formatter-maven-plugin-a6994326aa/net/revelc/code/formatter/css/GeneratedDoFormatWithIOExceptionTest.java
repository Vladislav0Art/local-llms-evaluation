package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatWithIOExceptionTest {

    @Test
    public void doFormatWithIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "any string";
        LineEnding ending = null;
        cssFormatter.doFormat(code, ending);
    }

}
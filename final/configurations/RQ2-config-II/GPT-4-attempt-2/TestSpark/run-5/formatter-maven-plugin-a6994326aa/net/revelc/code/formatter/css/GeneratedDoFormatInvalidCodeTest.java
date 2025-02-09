package net.revelc.code.formatter.css;

import java.io.IOException;
import java.util.*;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedDoFormatInvalidCodeTest {

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {backgroundcolour: lightblue;}";
        LineEnding ending = LineEnding.AUTO;

        cssFormatter.doFormat(code, ending);
    }

}
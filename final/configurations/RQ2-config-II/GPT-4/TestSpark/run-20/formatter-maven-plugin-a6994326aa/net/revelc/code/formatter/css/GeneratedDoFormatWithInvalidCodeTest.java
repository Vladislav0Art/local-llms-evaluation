package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedDoFormatWithInvalidCodeTest {

    @Test
    public void doFormatWithInvalidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat("body {background-color: lightblue;", LineEnding.CR);
    }

}
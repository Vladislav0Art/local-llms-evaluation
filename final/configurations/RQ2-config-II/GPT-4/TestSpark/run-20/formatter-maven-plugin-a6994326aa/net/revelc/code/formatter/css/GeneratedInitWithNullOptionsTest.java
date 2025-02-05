package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedInitWithNullOptionsTest {

    @Test
    public void initWithNullOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

}
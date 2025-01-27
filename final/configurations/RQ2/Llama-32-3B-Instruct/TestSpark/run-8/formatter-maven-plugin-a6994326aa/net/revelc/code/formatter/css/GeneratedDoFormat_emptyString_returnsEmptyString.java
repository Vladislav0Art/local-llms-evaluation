package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedDoFormat_emptyString_returnsEmptyString {

    public void setUp() {
    }

    @Test
    public void doFormat_emptyString_returnsEmptyString() throws Exception {
        String result = new CssFormatter().doFormat("", LineEnding.LF);
        assertEquals("", result);
    }

}
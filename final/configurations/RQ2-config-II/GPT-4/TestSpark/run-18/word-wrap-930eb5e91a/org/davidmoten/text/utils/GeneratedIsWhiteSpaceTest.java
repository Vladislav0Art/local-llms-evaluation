package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.StringReader;
import java.io.StringWriter;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.nio.charset.Charset;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsWhiteSpaceTest {

    @Test
    public void isWhiteSpaceTest() {
        CharSequence data = "  ";
        assertEquals("Whitespace error.", true, WordWrap.isWhitespace(data));
    }

}
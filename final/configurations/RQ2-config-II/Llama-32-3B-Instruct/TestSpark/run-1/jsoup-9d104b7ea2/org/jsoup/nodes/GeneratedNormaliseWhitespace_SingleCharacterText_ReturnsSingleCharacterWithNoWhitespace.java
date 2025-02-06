package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedNormaliseWhitespace_SingleCharacterText_ReturnsSingleCharacterWithNoWhitespace {

    @Test
    public void normaliseWhitespace_SingleCharacterText_ReturnsSingleCharacterWithNoWhitespace() {
        String original = "a";
        String expected = "a";
        String result = StringUtil.normaliseWhitespace(original);
        assertEquals(expected, result);
    }

}
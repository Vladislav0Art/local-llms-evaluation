package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNormaliseWhitespace_GivenText_SetsCorrectWhitespace {

    @Test
    public void normaliseWhitespace_GivenText_SetsCorrectWhitespace() {
        String text = "   Hello World  ";
        assertTrue(StringUtil.normaliseWhitespace(text).equals("Hello World"));
    }

}
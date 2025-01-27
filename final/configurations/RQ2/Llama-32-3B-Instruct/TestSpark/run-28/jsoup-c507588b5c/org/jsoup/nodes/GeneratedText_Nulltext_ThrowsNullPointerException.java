package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_Nulltext_ThrowsNullPointerException {

    @Test
    public void text_Nulltext_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).text());
    }

}
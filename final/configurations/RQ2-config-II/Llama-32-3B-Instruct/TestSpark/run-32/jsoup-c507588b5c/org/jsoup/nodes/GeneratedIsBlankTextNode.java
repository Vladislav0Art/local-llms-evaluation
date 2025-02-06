package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlankTextNode {

    @Test
    public void isBlankTextNode() {
        String text = "";
        assertTrue(TextNode.createFromEncoded(text).isBlank());
    }

}
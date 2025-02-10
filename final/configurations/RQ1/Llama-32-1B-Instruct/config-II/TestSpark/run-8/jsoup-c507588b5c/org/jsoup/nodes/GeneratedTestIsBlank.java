package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        assertEquals(false, TextNode.createText("   ").isBlank());
        assertEquals(true, TextNode.createText("").isBlank());
        assertEquals(true, TextNode.createText("").isBlank());
        assertEquals(false, TextNode.createText("abc").isBlank());
    }

}
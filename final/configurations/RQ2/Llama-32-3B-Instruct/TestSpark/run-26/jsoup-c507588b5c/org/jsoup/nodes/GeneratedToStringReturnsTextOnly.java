package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedToStringReturnsTextOnly {

    @Test
    public void toStringReturnsTextOnly() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.toString());
    }

}
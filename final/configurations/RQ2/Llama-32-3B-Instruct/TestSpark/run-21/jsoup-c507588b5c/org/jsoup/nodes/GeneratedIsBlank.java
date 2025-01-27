package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
        TextNode node2 = new TextNode(" ");
        assertFalse(node2.isBlank());
    }

}
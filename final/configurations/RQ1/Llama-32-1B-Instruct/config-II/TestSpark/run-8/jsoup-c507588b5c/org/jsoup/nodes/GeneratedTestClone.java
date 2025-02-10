package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode text = createText("");
        TextNode clone = (TextNode) text.clone();
        assertEquals(text, clone);
    }

}
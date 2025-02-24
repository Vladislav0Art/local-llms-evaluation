package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("");
        assertNotNull(textNode.text());
    }

}
package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetWholeTextWithNull {

    @Test
    public void testGetWholeTextWithNull() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.getWholeText());
    }

}
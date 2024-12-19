package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextTest_Chaining {

    @Test
    public void textTest_Chaining() {
        TextNode textNode = new TextNode("   test   ");
        TextNode result = textNode.text("new text");
        assertEquals("new text", result.text());
    }

}
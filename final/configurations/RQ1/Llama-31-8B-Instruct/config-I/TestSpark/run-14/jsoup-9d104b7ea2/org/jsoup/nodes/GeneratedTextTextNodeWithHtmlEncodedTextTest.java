package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class GeneratedTextTextNodeWithHtmlEncodedTextTest {

    private String text;
    private boolean expected;

    public TextNodeTextTest(String text, boolean expected) {
        this.text = text;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", true},
                {"   ", true},
                {"Hello World", false},
                {"Hello\nWorld", false},
                {"&lt;Hello World&gt;", false}
        });
    }

    @Test
    public void textTextNodeWithHtmlEncodedTextTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;" + text + "&gt;");
        assertEquals(text, textNode.text());
    }

}
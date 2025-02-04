package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

public class Generated[TextNodeCreation][WithEmptyString]

Test {

    public static TextNode textNode = mock(TextNode.class);

    @BeforeClass
    public static void setUp () {
        Document document = new Document();
        Element parent = mock(Element.class);
        document.appendChild(parent);
        textNode = mock(TextNode.class);
        textNode.setparentNode(parent);
    }

    public String createText (String text){
        return StringUtil.normaliseWhitespace(text);
    }

    @Test
    public void [TextNodeCreation][WithEmptyString]Test() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}
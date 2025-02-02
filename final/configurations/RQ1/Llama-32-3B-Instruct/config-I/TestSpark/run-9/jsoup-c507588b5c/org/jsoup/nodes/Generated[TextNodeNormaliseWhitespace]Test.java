package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[TextNodeNormaliseWhitespace]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [TextNodeNormaliseWhitespace]Test() {
        String input = "   ";
        String expected = StringUtil.stripLeadingWhitespace(input);
        assertEquals(expected, TextNode.normaliseWhitespace(input));
    }

}
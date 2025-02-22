package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "&lt;test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<test>", textNode.getWholeText());
    }

}
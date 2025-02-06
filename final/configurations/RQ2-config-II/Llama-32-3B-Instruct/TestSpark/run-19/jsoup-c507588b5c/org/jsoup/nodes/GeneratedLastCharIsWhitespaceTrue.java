package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.html5.OutputSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedLastCharIsWhitespaceTrue {

    @Test
    public void lastCharIsWhitespaceTrue() {
        Mockito.when(StringBuilder.class, Mockito.mock(StringBuilder.class)).when(() -> {
            ((StringBuilder) Mockito.mock(StringBuilder.class)).append(' ');
            return (StringBuilder) this;
        }).thenAnswer((Mockito.IAnswer<StringBuilder>) () -> {
            StringBuilder sb = Mockito.mock(StringBuilder.class);
            sb.append(' ');
            return sb;
        });
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_returnsNullWhenDataIsEmpty {

    @Test
    public void asXmlDeclaration_returnsNullWhenDataIsEmpty() {
        Comment comment = new Comment("");
        assertAsNull(comment.asXmlDeclaration());
    }

}
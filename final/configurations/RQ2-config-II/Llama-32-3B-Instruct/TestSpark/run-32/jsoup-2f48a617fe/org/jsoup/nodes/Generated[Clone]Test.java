package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.ParserSettings;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.InputSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.Document.parse;
import static org.jsoup.nodes.ParserSettings.defaultConstructor;

@RunWith(MockitoJUnitRunner.class)
public class Generated[Clone]

Test {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void [Clone]Test() throws IOException {
        Document document = parse(new InputSource("<div><comment>test</comment></div>"));
        Element element = document.body().firstChild();
        assertNotNull(element);
        LeafNode comment = (LeafNode) element;
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
    }

}
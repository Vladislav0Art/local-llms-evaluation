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
public class Generated[CommentDataSet]

Test {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void [CommentDataSet]Test() {
        String data = "new test";
        LeafNode comment = new Comment("old test");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}
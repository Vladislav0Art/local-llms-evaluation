package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--test-->", accum.toString());
    }

}
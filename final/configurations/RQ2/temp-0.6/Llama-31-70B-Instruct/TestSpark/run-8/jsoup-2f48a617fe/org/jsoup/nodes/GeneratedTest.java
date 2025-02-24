package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    ParseSettings parseSettings;

    @Mock
    Parser parser;

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("comment");
        assertEquals("comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, parseSettings);
        assertEquals("<!--comment-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, parseSettings);
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("comment");
        assertEquals("Comment[comment]", comment.toString());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.BeforeEach;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestComment_outerHtmlHead {

    public static final CommentCommentData DATA = new CommentCommentData("test");

    private Comment comment;

    @BeforeEach
    void setup() {
        comment = new Comment(DATA.getData());
    }

    @Test
    public void testComment_outerHtmlHead() throws IOException {
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);
        parser.parse("", "");
        String expectedOuterHtmlTailContent = "<!-- comment -->";
        String actualOuterHtmlTailContent = comment.outerHtmlTail(parser, 0).toString();
        assertEquals(expectedOuterHtmlTailContent, actualOuterHtmlTailContent);
    }

}
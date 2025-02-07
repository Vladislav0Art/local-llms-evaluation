package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.BeforeEach;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTest {

    public static final CommentCommentData DATA = new CommentCommentData("test");

    private Comment comment;

    @BeforeEach
    void setup() {
        comment = new Comment(DATA.getData());
    }

    @Test
    public void testCommentName() {
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void testCommentData() {
        assertEquals(DATA.getData(), comment.getData());
    }

    @Test
    public void testComment

    setData() {
        comment.setData(DATA.getData());
        assertEquals(DATA.getData(), comment.getData());
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

    @Test
    public void testComment_outerHtmlHead_empty() throws IOException {
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);
        parser.parse("", "");
        String expectedOuterHtmlTailContent = "";
        String actualOuterHtmlTailContent = comment.outerHtmlTail(parser, 0).toString();
        assertEquals(expectedOuterHtmlTailContent, actualOuterHtmlTailContent);
    }

    @Test
    public void testComment_outerHtmlTail() throws IOException {
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);
        parser.parse("", "");
        String expectedOuterHtmlTailContent = "<!-- comment -->";
        String actualOuterHtmlTailContent = comment.outerHtmlTail(parser, 0).toString();
        assertEquals(expectedOuterHtmlTailContent, actualOuterHtmlTailContent);
    }

    @Test
    public void testComment_clone() {
        Comment clonedComment = comment.clone();
        assertTrue(clonedComment.getData().equals(DATA.getData()));
    }

    @Test
    public void testComment_isXmlDeclaration() {
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void test_comment_as_xml_declaration() throws IOException {
        Document document = new Document();
        Comment commentAsXmlDeclaration = (Comment) document.createElement("comment").asXmlDeclaration();
        assertNotNull(commentAsXmlDeclaration);
    }
}

class CommentCommentData {

    private String data;

    public CommentCommentData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameShouldReturnCommentNode() {
        Comment comment = new Comment("This is a comment");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataShouldReturnCommentData() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void setDataShouldSetCommentData() {
        Comment comment = new Comment("This is a comment");
        comment.setData("This is another comment");
        assertEquals("This is another comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadShouldReturnCommentOuterHtmlHead() throws IOException {
        Comment comment = new Comment("");
        ParseSettings parseSettings = new ParseSettings();
        comment.outerHtmlHead(parseSettings, 0, null);
        assertNotNull(comment.outerHtmlHead);
    }

    @Test
    public void outerHtmlTailShouldReturnCommentOuterHtmlTail() throws IOException {
        Comment comment = new Comment("");
        ParseSettings parseSettings = new ParseSettings();
        comment.outerHtmlTail(parseSettings, 0, null);
        assertNotNull(comment.outerHtmlTail);
    }

    @Test
    public void toStringShouldReturnCommentToString() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.toString());
    }

    @Test
    public void cloneShouldCloneComment() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationShouldReturnFalse() {
        Comment comment = new Comment("");
        assertTrue(!comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationShouldReturnTrue() {
        Comment comment = new Comment("This is a comment");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("comment", xmlDeclaration.nodeValue);
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void constructorHasCorrectData() {
        String data = "This is a comment";
        public Comment comment = new public Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameIsComment() {
        public Comment comment = new public Comment("This is a comment");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void outerHtmlHeadIsNotUsedInComment() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        public Document.OutputSettings settings = public Document.OutputSettings.get();
        public Comment comment = new public Comment("This is a comment");
        comment.outerHtmlHead(outContent, 0, settings);
        assertEquals(0, outContent.size());
    }

    @Test
    public void outerHtmlTailSetsCorrectData() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        public Document.OutputSettings settings = public Document.OutputSettings.get();
        public Comment comment = new public Comment("This is a comment");
        comment.outerHtmlTail(outContent, 0, settings);
        String expectedOut = "/*-- This is a comment --*/\n";
        assertEquals(expectedOut, outContent.toString());
    }

    @Test
    public void toStringIncludesNodeName() {
        public Comment comment = new public Comment("This is a comment");
        String expectedOut = "<comment>This is a comment</comment>";
        assertEquals(expectedOut, comment.toString());
    }

    @Test
    public void cloneCreatesNewCommentWithCorrectData() throws CloneNotSupportedException {
        public Comment originalComment = new public Comment("This is a comment");
        public Comment clonedComment = originalComment.clone();
        String expectedData = "This is a comment";
        assertTrue(clonedComment.getData().equals(expectedData));
    }

    @Test
    public void isXmlDeclarationReturnsFalseForCorrectComment() {
        public Comment comment = new public Comment("This is a comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationCastsToNullForIncorrectComment() {
        public Comment comment = new public Comment("This is not an XML declaration");
        assertNull(comment.asXmlDeclaration());
    }

}
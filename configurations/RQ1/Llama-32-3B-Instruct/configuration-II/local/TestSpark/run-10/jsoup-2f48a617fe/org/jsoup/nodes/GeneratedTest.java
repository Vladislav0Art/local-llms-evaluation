package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createComment_withData

    ReturnsCorrectComment() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("This is a comment");
        assertThat(comment.getData(), is("This is a comment"));
    }

    @Test
    public void getData_ThrowsIOExceptionWhenEmptyStringPassed() throws IOException {
        // [MethodUnderTest][Scenario]Test
        try {
            new Comment("").getData();
            assertThat(false, is(true));
        } catch (IOException e) {
            assertThat(e.getMessage(), is("Input cannot be null or empty"));
        }
    }

    @Test
    public void outerHtmlHead_WritesCorrectXml() throws IOException {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("<!-- This is a test comment -->");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, depth, out);
        assertThat(outContent.toString(), is("<!--This is a test comment-->"));
    }

    @Test
    public void outerHtmlTail_WritesCorrectXml() throws IOException {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("<!-- This is a test comment -->");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, depth, out);
        assertThat(outContent.toString(), is(""));
    }

    @Test
    public void clone_ReturnsCorrectComment() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("This is a test comment");
        Comment clonedComment = comment.clone();
        assertThat(clonedComment.getData(), is(comment.getData()));
    }

    @Test
    public void isXmlDeclaration_ReturnsTrueWhenStartingWithExclamationMark() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("!This is an XML declaration");
        assertThat(comment.isXmlDeclaration(), is(true));
    }

    @Test
    public void asXmlDeclaration_ReturnsNullWhenNotStartingWithExclamationMark() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("This is a comment");
        assertThat(comment.asXmlDeclaration(), is(null));
    }

    @Test
    public void isXmlDeclarationReturnsFalseWhenDataIsTooShort() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("");
        assertThat(comment.isXmlDeclaration(), is(false));
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;

public class GeneratedTest {

    @Test
    public void CommentConstructorHasValidName() {
        Comment comment = new Comment("data");
        assertThat(comment.nodeName(), is("COMMENT"));
    }

    @Test
    public void CommentDataIsAccessible() {
        Comment comment = new Comment("data");
        assertThat(comment.getData(), is("data"));
    }

    @Test
    public void SettingDataUpdatesCommentData() {
        Comment comment = new Comment("oldData");
        String oldData = comment.getData();
        comment.setData("newData");
        assertThat(comment.getData(), is("newData"));
        assertThat(oldData, is("oldData"));
    }

    @Test
    public void CommentSetsNodeName() {
        Comment comment = new Comment("data");
        comment.set.nodeName("newName");
        assertThat(comment.nodeName(), is("NEWNAME"));
    }

    @Test
    public void OuterHtmlHeadAddsCommentToHTML() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertThat(accum.toString(), is("<COMMENT data=\"data\"></COMMENT>"));
    }

    @Test
    public void OuterHtmlTailAddsCommentToHTML() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, 0, out);
        assertThat(accum.toString(), is("<COMMENT data=\"data\"></COMMENT>"));
    }

    @Test
    public void ToStringReturnsCommentData() {
        Comment comment = new Comment("data");
        assertThat(comment.toString(), is("data"));
    }

    @Test
    public void CloneCreatesNewCommentWithSameData() {
        Comment comment = new Comment("data");
        Comment clone = comment.clone();
        assertThat(clone.getData(), is("data"));
    }

    @Test
    public void isXmlDeclarationReturnsTrueForComments() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNullForNonXmlComment() {
        Comment comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}
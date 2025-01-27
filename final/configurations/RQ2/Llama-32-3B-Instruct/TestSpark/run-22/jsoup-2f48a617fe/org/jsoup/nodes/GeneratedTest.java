package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void newNodeDataIsCorrect() {
        Comment comment = new Comment("test");
        assertThat(comment.getData(), is("test"));
    }

    @Test
    public void setNewNodeDataAndVerifyIt() {
        Comment comment = new Comment("");
        comment.setData("new test");
        assertThat(comment.getData(), is("new test"));
    }

    @Test
    public void nodeNameIsCorrect() {
        Comment comment = new Comment("");
        assertThat(comment.nodeName(), is(""));
    }

    @Test
    public void cloneCreatesNewCommentWithSameData() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        assertThat(clonedComment.getData(), is("test"));
    }

    @Test
    public void xmlDeclarationIsFalseByDefault() {
        Comment comment = new Comment("");
        assertThat(comment.isXmlDeclaration(), is(false));
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;

public class GeneratedCommentSetsNodeName {

    @Test
    public void CommentSetsNodeName() {
        Comment comment = new Comment("data");
        comment.set.nodeName("newName");
        assertThat(comment.nodeName(), is("NEWNAME"));
    }

}
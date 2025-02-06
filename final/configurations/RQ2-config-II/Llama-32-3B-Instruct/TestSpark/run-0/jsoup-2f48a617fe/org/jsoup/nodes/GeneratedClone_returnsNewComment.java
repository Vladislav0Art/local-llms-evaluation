package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class GeneratedClone_returnsNewComment {

    @Test
    public void clone_returnsNewComment() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertThat(cloned, not(nullValue()));
        assertThat(cloned.getData(), is(comment.getData()));
    }

}
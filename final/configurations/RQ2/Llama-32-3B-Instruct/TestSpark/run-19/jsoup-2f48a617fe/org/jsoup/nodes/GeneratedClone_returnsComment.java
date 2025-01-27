package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedClone_returnsComment {

    @Test
    public void clone_returnsComment() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        AssertSame(comment, cloned);
    }

}
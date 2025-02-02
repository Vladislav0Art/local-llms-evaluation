package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSetDataOnComment_HandlesNullDataCorrectly {

    @Test
    public void SetDataOnComment_HandlesNullDataCorrectly() {
        Comment comment = new Comment("Hello, World!");
        comment.setData(null);
        assert comment.getData().isEmpty();
    }

}
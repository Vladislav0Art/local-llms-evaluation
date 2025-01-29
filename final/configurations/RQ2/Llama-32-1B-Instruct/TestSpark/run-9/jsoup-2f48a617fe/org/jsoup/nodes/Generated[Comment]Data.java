package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;

public class Generated[Comment]

Data {

    @Test
    public void [Comment]Data() {
        String data = "test";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}
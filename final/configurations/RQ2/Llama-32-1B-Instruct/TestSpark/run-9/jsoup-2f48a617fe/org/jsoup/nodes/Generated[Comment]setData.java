package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;

public class Generated[Comment]

setData {

    @Test
    public void [Comment]setData() {
        String data = "test";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}
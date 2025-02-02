package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedCreateCommentWithEmptyString_returnsSameObject {

    @Test
    public void createCommentWithEmptyString_returnsSameObject() {
        Comment comment1 = new Comment("");
        Comment comment2 = new Comment("");
        assert comment1 == comment2;
    }

}
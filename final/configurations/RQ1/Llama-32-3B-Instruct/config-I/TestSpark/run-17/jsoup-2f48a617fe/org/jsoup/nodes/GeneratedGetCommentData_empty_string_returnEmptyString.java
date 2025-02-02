package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedGetCommentData_empty_string_returnEmptyString {

    @Test
    public void getCommentData_empty_string_returnEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}
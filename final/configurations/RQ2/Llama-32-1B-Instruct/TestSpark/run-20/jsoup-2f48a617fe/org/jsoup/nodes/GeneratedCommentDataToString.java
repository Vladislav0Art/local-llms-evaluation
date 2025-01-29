package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCommentDataToString {

    @Test
    public void commentDataToString() {
        String data = "This is a test comment";
        Document document = new Document();
        document.addTag(new Comment(data));
        System.out.println(document.data().toString());
    }

}
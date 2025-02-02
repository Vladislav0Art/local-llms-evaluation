package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedCreateCommentWithInvalidData_throwsException {

    @Test
    public void createCommentWithInvalidData_throwsException() {
        try {
            new Comment(null);
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }

    public static boolean notNull(Object obj) {
        return obj != null && !obj.equals("");
    }

}
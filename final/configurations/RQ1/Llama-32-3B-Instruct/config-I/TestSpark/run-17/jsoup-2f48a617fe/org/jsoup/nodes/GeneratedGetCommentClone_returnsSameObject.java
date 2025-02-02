package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedGetCommentClone_returnsSameObject {

    @Test
    public void getCommentClone_returnsSameObject() {
        Comment comment1 = new Comment("Hello, World!");
        Comment comment2 = comment1.clone();
        assert comment1 == comment2;
    }
}

public class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public static boolean notNull(Object obj) {
        return obj != null && !obj.equals("");
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return notNull(data).equals(notNull(comment.getData()));
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

    public Comment clone() {
        return new Comment(this.data);
    }

}
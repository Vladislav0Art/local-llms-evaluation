package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static String getNodeName(Comment comment) {
        if (comment == null) {
            throw new NullPointerException("comment cannot be null");
        }
        return comment.getData();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return data.equals(comment.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}

public class Appendable {
    private StringBuilder sb;

    public void append(String text) {
        this.sb.append(text);
    }

    public boolean isAppendable() {
        return true;
    }
}

import org.junit.Test;
import static org.hamcrest.MatcherAssert .*;
        import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito .*;

public class CommentTest {

}
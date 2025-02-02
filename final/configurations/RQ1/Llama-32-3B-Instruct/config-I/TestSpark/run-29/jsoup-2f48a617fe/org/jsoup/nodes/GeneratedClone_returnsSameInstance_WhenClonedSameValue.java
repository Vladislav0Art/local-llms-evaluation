package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertFalse;

public class GeneratedClone_returnsSameInstance_WhenClonedSameValue {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class MockParser {

    private String parsedData;

    public void setParsedData(String data) {
        this.parsedData = data;
    }

    public String getParsedData() {
        return parsedData;
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertFalse;

public class CommentTest {

    @Test
    public void clone_returnsSameInstance_WhenClonedSameValue() {
        Comment comment = new Comment("Hello World!");
        Comment clonedComment = comment.clone();
        assertSame(comment, clonedComment);
    }

}
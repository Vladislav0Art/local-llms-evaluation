package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertFalse;

public class GeneratedClone_returnsDifferentInstance_ifModified {

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
    public void clone_returnsDifferentInstance_ifModified() {
        MockParser parser = new MockParser();
        parser.setParsedData("Hello World!");
        Comment originalComment = new Comment(parser.getParsedData());
        Comment modifiedComment = new Comment(originalComment.getData() + " Modified");
        Comment clonedComment = modifiedComment.clone();
        assertFalse(originalComment.equals(clonedComment));
    }

}
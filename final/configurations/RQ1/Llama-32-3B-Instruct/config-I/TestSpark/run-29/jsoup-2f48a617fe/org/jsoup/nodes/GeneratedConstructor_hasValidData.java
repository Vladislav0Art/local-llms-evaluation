package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertFalse;

public class GeneratedConstructor_hasValidData {

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
    public void constructor_hasValidData() {
        Comment comment = new Comment("Hello World!");
        assertEquals("Hello World!", comment.getData());
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private java.util.HashMapjava.lang.String,java.util.Listjava.lang.String>>comments;

    public CommentsConfiguration() {
        this.comments = new java.util.HashMap > ();
    }

    public void setPath(String key, String value) {
        if (comments == null) {
            comments = new java.util.HashMap > ();
        }
        comments.put(key, java.util.Arrays.asList(value));
    }

    public String getComment(String path) {
        return comments.get(path);
    }

    public java.util.Mapjava.lang.String,java.util.Listjava.lang.String>>

    getAllComments() {
        return comments;
    }
}

public class TestCommentsConfiguration {

    private CommentsConfiguration config;

    @Test
    public void testAllCommentsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

}
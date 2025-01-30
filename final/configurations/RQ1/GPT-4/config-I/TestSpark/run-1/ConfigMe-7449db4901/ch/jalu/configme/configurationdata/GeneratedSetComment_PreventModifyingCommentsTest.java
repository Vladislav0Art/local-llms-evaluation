package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetComment_PreventModifyingCommentsTest {

    @Test
    public void setComment_PreventModifyingCommentsTest() {
        String path = "testPath";
        String comment = "The single comment line";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, comment);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        try {
            comments.put("testKey", Collections.singletonList("testValue"));
            fail("Should have thrown an UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }

        try {
            comments.get(path).add("Impossible comment");
            fail("Should have thrown an UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

}
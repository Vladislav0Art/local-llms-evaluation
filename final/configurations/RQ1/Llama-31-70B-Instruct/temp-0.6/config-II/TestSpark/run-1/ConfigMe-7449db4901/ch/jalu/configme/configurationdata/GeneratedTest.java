package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCommentCorrectPathTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1", "comment2");

        List<String> expectedComments = Arrays.asList("comment1", "comment2");
        assertEquals(expectedComments, config.getAllComments().get("path"));
    }

}
package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        commentsConfiguration.setComment(path, "comment1", "comment2");
        assertEquals(Arrays.asList("comment1", "comment2"), commentsConfiguration.getAllComments().get(path));
    }

}
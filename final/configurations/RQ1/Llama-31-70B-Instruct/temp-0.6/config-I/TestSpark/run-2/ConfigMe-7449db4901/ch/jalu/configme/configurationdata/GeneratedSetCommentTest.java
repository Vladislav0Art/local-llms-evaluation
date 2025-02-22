package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        commentsConfiguration.setComment("path2", "comment3");

        assertEquals(2, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("comment1", "comment2"), commentsConfiguration.getAllComments().get("path1"));
        assertEquals(Arrays.asList("comment3"), commentsConfiguration.getAllComments().get("path2"));
    }

}
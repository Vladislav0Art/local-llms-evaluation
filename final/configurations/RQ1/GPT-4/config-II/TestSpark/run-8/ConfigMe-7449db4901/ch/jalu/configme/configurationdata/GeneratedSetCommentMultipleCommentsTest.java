package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentMultipleCommentsTest {

    @Test
    public void setCommentMultipleCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my-path", "my-comment1", "my-comment2");
        assertEquals("Map should have 2 comments set",
                Arrays.asList("my-comment1", "my-comment2"),
                commentsConfiguration.getAllComments().get("my-path"));
    }

}
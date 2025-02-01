package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentSingleCommentTest {

    @Test
    public void setCommentSingleCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my-path", "my-comment");
        assertEquals("Map should have single comment set",
                Collections.singletonList("my-comment"),
                commentsConfiguration.getAllComments().get("my-path"));
    }

}
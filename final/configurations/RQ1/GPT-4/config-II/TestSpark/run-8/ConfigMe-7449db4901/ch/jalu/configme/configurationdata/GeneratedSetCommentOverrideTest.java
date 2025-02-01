package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my-path", "my-comment");
        commentsConfiguration.setComment("my-path", "my-new-comment");
        assertEquals("Setting comment should override previous value",
                Collections.singletonList("my-new-comment"),
                commentsConfiguration.getAllComments().get("my-path"));
    }

}
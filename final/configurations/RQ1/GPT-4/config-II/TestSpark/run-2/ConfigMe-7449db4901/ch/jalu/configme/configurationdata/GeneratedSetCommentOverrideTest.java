package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments1 = {"comment1", "comment2"};
        String[] comments2 = {"comment3", "comment4"};
        commentsConfiguration.setComment("key1", comments1);
        commentsConfiguration.setComment("key1", comments2);
        List<String> latestComments = commentsConfiguration.getAllComments().get("key1");
        assertEquals("latest comments different from expected", Arrays.asList(comments2), latestComments);
    }

}
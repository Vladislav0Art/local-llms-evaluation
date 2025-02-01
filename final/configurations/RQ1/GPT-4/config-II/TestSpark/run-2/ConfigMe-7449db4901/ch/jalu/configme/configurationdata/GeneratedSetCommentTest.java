package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments = {"comment1", "comment2"};
        commentsConfiguration.setComment("key1", comments);
        List<String> savedComments = commentsConfiguration.getAllComments().get("key1");
        assertEquals("saved comments different from expected", Arrays.asList(comments), savedComments);
    }

}
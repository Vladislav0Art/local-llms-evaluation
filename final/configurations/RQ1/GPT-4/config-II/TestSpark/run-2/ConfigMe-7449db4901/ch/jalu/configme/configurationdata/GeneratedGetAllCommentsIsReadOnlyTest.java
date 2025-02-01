package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsIsReadOnlyTest {

    @Test
    public void getAllCommentsIsReadOnlyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("key1", "comment1");
        commentsConfiguration.getAllComments().put("key2", Arrays.asList("comment2"));
    }

}
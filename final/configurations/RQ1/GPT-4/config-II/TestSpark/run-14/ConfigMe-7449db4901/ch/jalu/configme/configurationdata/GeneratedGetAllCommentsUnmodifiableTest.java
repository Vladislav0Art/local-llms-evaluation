package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsUnmodifiableTest {

    @Test
    public void getAllCommentsUnmodifiableTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("custom.path", "myComment");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        allComments.put("illegal.path", Arrays.asList("illegalComment"));
    }

}
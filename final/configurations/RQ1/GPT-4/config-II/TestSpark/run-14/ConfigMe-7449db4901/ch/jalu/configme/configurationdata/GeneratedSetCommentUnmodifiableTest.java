package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentUnmodifiableTest {

    @Test
    public void setCommentUnmodifiableTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("custom.path", "myComment1", "myComment2");
        commentsConfiguration.getAllComments().get("custom.path").add("illegalComment");
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("XYZ", "This is a comment on XYZ");
        Assert.assertEquals(Arrays.asList("This is a comment on XYZ"), commentsConfiguration.getAllComments().get("XYZ"));
    }

}
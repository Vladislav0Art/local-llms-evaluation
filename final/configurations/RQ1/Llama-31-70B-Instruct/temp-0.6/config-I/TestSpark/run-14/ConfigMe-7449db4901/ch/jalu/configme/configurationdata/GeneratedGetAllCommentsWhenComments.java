package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsWhenComments {

    @Test
    public void getAllCommentsWhenComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test", "comment1", "comment2");
        Assert.assertEquals(1, commentsConfiguration.getAllComments().size());
        Assert.assertEquals(2, commentsConfiguration.getAllComments().get("test").size());
    }

}
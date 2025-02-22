package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsWhenNoComments {

    @Test
    public void getAllCommentsWhenNoComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertEquals(0, commentsConfiguration.getAllComments().size());
    }

}
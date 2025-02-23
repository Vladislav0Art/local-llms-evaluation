package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOneCommentLineTest {

    @Test
    public void setCommentOneCommentLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment");
        Assert.assertEquals(1, commentsConfiguration.getAllComments().size());
        Assert.assertEquals(1, commentsConfiguration.getAllComments().get("path").size());
        Assert.assertEquals("comment", commentsConfiguration.getAllComments().get("path").get(0));
    }

}
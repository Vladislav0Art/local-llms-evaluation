package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        // Given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // When
        commentsConfiguration.setComment("NewPath", "New comment");

        // Then
        Assert.assertEquals(1, commentsConfiguration.getAllComments().size());
        Assert.assertEquals("New comment", commentsConfiguration.getAllComments().get("NewPath").get(0));
    }

}
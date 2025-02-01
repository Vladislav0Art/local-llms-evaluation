package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationConstructorWithNoArgsTest {

    @Test
    public void commentsConfigurationConstructorWithNoArgsTest() {
        // When
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // Then
        Assert.assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}
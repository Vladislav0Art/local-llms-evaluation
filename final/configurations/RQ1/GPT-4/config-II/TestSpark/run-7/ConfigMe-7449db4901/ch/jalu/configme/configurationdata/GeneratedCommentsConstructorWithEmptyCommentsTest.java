package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

public class GeneratedCommentsConstructorWithEmptyCommentsTest {

    @Test
    public void commentsConstructorWithEmptyCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(initialComments);

        Assert.assertNotNull(config.getAllComments());
        Assert.assertTrue(config.getAllComments().isEmpty());
    }

}
package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

public class GeneratedGetAllCommentsWithEmptyCommentsTest {

    @Test
    public void getAllCommentsWithEmptyCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();

        Assert.assertNotNull(comments);
        Assert.assertTrue(comments.isEmpty());
    }

}
package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

public class GeneratedGetAllCommentsWithNonEmptyCommentsTest {

    @Test
    public void getAllCommentsWithNonEmptyCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path.key", "line1", "line2", "line3");
        Map<String, List<String>> comments = config.getAllComments();

        Assert.assertNotNull(comments);
        Assert.assertFalse(comments.isEmpty());
        Assert.assertTrue(comments.containsKey("path.key"));
        Assert.assertThat(comments.get("path.key"), hasSize(3));
    }

}
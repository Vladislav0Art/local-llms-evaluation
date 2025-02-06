package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsCreatedCorrectly {

    @Test
    public void newCommentsConfigurationIsCreatedCorrectly() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        comments.put("path2", Arrays.asList("comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertThat(commentsConfiguration.getAllComments(), is(comments));
    }

}
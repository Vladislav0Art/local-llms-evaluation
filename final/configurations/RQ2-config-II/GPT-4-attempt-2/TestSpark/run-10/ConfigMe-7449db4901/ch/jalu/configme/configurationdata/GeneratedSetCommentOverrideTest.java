package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", Arrays.asList("InitialLine1", "InitialLine2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        String expectedPath = "path1";
        String[] expectedCommentLines = new String[]{"Line1", "Line2", "Line3"};
        commentsConfiguration.setComment(expectedPath, expectedCommentLines);

        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();
        assertThat(actualComments.size(), is(1));
        assertThat(actualComments.get(expectedPath), is(Arrays.asList(expectedCommentLines)));
    }

}
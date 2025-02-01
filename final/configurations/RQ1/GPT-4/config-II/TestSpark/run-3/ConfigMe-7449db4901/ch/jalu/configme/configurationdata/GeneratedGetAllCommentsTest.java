package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> mockComments = new HashMap<>();
        mockComments.put("path1", Arrays.asList("Test Comment1", "Test Comment2"));
        CommentsConfiguration cc = new CommentsConfiguration(mockComments);
        Map<String, List<String>> comments = cc.getAllComments();

        assertThat(comments, is(mockComments));
    }

}
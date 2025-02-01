package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsImmutableViewTest {

    @Test
    public void getAllCommentsImmutableViewTest() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("test-path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(customComments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        try {
            allComments.put("failure-test-path", Collections.singletonList("my-comment"));
            fail("Unmodifiable map should throw UnsupportedOperationException on put operation");
        } catch (UnsupportedOperationException e) {
            assertEquals("Custom constructor should return unmodifiable map",
                    customComments, allComments);
        }
    }

}
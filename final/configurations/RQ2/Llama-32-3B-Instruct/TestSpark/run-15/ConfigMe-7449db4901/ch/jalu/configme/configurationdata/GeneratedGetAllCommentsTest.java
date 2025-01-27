package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String path2 = "path2";
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path1, Arrays.asList("comment1", "comment2"));
        expectedComments.put(path2, Collections.singletonList(""));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}
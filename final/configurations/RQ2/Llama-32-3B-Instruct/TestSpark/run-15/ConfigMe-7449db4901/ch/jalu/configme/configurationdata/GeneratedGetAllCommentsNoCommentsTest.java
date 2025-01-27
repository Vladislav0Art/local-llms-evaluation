package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetAllCommentsNoCommentsTest {

    @Test
    public void getAllCommentsNoCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String path2 = "path2";
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path1, Collections.emptyList());
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}
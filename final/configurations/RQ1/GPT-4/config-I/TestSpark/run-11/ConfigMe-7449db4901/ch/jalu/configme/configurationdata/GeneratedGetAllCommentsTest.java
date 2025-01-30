package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String comment11 = "comment11";
        String comment12 = "comment12";
        commentsConfiguration.setComment(path1, comment11, comment12);

        String path2 = "path2";
        String comment21 = "comment21";
        commentsConfiguration.setComment(path2, comment21);

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path1, Arrays.asList(comment11, comment12));
        expectedComments.put(path2, Arrays.asList(comment21));

        assertEquals("Get all comments should return a map with all comments", expectedComments, commentsConfiguration.getAllComments());
    }

}
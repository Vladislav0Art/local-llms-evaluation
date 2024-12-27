package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        String path = "path1";
        String[] commentLines = {"Line 1", "Line 2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(allComments.get(path), Arrays.asList(commentLines));
    }

}
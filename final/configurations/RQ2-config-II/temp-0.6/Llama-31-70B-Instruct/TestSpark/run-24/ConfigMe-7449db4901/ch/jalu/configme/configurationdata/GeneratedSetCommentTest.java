package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = {"comment1", "comment2"};
        config.setComment("path1", commentLines);
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.containsKey("path1"));
        List<String> commentList = comments.get("path1");
        assertEquals(Arrays.asList(commentLines), commentList);
    }

}
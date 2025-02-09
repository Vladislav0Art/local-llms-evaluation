package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        String[] commentLines = new String[]{"line 1", "line 2"};
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(allComments.get(path), Arrays.asList(commentLines));
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentNullPathTest {

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(null, commentLines);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

}
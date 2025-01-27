package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCommentNoLinesTest {

    @Test
    public void setCommentNoLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = {};
        Map<String, List<String>> actualComments = commentsConfiguration.setComment(path, commentLines);
        assertTrue(actualComments.containsKey(path));
        assertTrue(actualComments.get(path).isEmpty());
    }

}
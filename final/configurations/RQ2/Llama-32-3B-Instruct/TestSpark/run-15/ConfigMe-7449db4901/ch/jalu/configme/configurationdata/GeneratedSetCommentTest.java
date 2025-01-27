package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = {"comment1", "comment2"};
        Map<String, List<String>> actualComments = commentsConfiguration.setComment(path, commentLines);
        assertTrue(actualComments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), actualComments.get(path));
    }

}
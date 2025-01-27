package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCommentEmptyLineTest {

    @Test
    public void setCommentEmptyLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = {""};
        Map<String, List<String>> actualComments = commentsConfiguration.setComment(path, commentLines);
        assertTrue(actualComments.containsKey(path));
        assertEquals(Collections.singletonList(""), actualComments.get(path));
    }

}
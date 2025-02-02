package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedSetCommentWithNewLineTest {

    @Test
    public void setCommentWithNewLineTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = {"comment1", "\n"};
        configuration.setComment(path, commentLines);
        assertTrue(configuration.comments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), configuration.comments.get(path));
    }

}
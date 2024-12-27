package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "myPath";
        String[] commentLines = new String[]{"line1", "line2", "line3"};
        configuration.setComment(path, commentLines);

        Map<String, List<String>> allComments = configuration.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), allComments.get(path));
    }

}
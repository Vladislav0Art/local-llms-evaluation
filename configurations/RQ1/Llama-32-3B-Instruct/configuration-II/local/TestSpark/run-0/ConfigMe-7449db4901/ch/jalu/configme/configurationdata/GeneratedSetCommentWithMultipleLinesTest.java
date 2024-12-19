package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentWithMultipleLinesTest {

    @Test
    public void setCommentWithMultipleLinesTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String[] commentLines = {"line1", "", "line3"};
        configuration.setComment("path", commentLines);
        assertTrue(configuration.comments.containsKey("path"));
        List<String> expected = Arrays.asList(commentLines[0], "", commentLines[2]);
        assertEquals(expected, configuration.comments.get("path"));
    }

}
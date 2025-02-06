package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCommentMultipleLinesTest {

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = {"line1", "line2"};
        config.setComment("path", commentLines[0], commentLines[1]);
        assertEquals(Arrays.asList(commentLines), config.getAllComments().get("path"));
    }

}
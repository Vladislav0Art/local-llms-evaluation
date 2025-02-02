package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentMultipleLinesWithMarkersTest {

    @Test
    public void setCommentMultipleLinesWithMarkersTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "path";
        List<String> commentLines = Arrays.asList("line1#", "line2", "#", "line3");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComment(path, commentLines.get(0), "#", commentLines.get(1));
        assertEquals(Arrays.asList(commentLines.get(1)), commentsConfiguration.comments.get(path).get(1));
    }

}
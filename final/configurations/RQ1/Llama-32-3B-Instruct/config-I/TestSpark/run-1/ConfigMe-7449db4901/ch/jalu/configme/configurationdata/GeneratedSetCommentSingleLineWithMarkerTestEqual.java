package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSingleLineWithMarkerTestEqual {

    @Test
    public void setCommentSingleLineWithMarkerTestEqual() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "path";
        List<String> commentLines = Arrays.asList("line1#", "line2");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(Arrays.asList("#", ""), commentsConfiguration.getComments().get(path));
    }

}
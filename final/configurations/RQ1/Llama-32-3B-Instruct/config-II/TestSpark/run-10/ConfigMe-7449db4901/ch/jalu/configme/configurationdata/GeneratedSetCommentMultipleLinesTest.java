package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentMultipleLinesTest {

    @Test
    public void setCommentMultipleLinesTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "path";
        String commentLine1 = "line1";
        String commentLine2 = "line2";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLine1, commentLine2);
        assertEquals(Arrays.asList(commentLine1, commentLine2), commentsConfiguration.comments.get(path));
    }

}
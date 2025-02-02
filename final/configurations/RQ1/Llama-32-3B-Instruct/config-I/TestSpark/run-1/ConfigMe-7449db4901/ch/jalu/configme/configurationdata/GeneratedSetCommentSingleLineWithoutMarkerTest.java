package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSingleLineWithoutMarkerTest {

    @Test
    public void setCommentSingleLineWithoutMarkerTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "path";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComment(path, "\n", "");
        assertEquals(Collections.singletonList(""), commentsConfiguration.comments.get(path));
    }

}
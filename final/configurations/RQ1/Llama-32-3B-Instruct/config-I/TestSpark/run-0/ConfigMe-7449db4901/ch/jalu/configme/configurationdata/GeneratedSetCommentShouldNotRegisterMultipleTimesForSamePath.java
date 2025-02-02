package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentShouldNotRegisterMultipleTimesForSamePath {

    @Test
    public void setCommentShouldNotRegisterMultipleTimesForSamePath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration c = new CommentsConfiguration(comments);
        String commentLines[] = {"line1", "\n", "line2"};
        c.setComment("path1", commentLines);
        assertEquals(1, c.comments.get("path1").size());
    }

}
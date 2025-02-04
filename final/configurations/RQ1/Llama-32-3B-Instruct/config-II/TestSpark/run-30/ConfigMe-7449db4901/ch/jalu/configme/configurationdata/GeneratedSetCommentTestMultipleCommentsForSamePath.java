package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class GeneratedSetCommentTestMultipleCommentsForSamePath {

    @Test
    public void setCommentTestMultipleCommentsForSamePath() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"#line1", "#line2"};
        configuration.setComment(path, commentLines);
        List<String> expectedCommentLines = Arrays.asList("#line1", "#line2");
        assertEquals(expectedCommentLines, configuration.comments.get(path));
    }

}
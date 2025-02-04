package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class GeneratedSetCommentTestEmptyLines {

    @Test
    public void setCommentTestEmptyLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"#line1"};
        configuration.setComment(path, commentLines);
        List<String> expectedCommentLines = Arrays.asList("#line1");
        assertEquals(expectedCommentLines, configuration.comments.get(path));
    }

}
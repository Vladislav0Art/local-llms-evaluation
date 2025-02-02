package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedSetCommentTestAgain {

    @Test
    public void setCommentTestAgain() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "testPath";
        List<String> commentLines = Arrays.asList("line1", "line2");
        configuration.setComment(path, commentLines);
        assertEquals(commentLines, configuration.getComments().get(path));
    }

}
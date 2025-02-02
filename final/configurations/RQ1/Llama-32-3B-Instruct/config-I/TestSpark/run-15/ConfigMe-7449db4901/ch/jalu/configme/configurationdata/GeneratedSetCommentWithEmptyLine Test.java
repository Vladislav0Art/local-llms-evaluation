package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedSetCommentWithEmptyLine Test {

    @Test
    public void SetCommentWithEmptyLine

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = {"\n"};
        configuration.setComment(path, commentLines);
        assertTrue(configuration.comments.containsKey(path));
        assertEquals(Collections.singletonList(commentLines[0]), configuration.comments.get(path));
    }

}
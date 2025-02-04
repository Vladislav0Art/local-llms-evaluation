package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class GeneratedSetCommentTestEmptyLineResultingInEmptyLine {

    @Test
    public void setCommentTestEmptyLineResultingInEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"\n"};
        configuration.setComment(path, commentLines);
        assertEquals(1, configuration.comments.get(path).size());
    }

}
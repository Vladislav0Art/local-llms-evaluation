package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSetCommentTest_AddingLinesWithEmptyLine {

    @Test
    public void setCommentTest_AddingLinesWithEmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        String line1 = "\n";
        String line2 = "line2";
        List<String> lines = new ArrayList<>(Arrays.asList(line1, line2));
        config.setComment(path, line1, line2);
        assertEquals(Arrays.asList(line2), config.comments.get(path));
    }

}
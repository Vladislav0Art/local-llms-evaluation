package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSetCommentTest_OverridingExistingLines {

    @Test
    public void setCommentTest_OverridingExistingLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        String line1 = "line1\n";
        String line2 = "line2";
        List<String> lines = new ArrayList<>(Arrays.asList(line1, line2));
        config.setComment(path, line1, line2);
        config.setComment(path, line2, "line3");
        assertEquals(Arrays.asList("line3"), config.comments.get(path));
    }

}
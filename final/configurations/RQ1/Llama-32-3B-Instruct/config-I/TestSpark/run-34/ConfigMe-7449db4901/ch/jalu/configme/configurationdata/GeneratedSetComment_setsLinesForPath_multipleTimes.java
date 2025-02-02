package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsLinesForPath_multipleTimes {

    @Test
    public void setComment_setsLinesForPath_multipleTimes() {
        String path = "test-path";
        List<String> lines = Arrays.asList("line1", "line2");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, lines);
        commentsConfiguration.setComment(path, Arrays.asList("line3", "line4"));
        assertNotNull(commentsConfiguration.getComments().get(path));
        assertEquals(Arrays.asList("line3", "line4"), commentsConfiguration.getComments().get(path));
    }

}
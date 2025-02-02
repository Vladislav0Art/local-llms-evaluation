package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsMultipleLinesForPathWithLeadingNewLine {

    @Test
    public void setComment_setsMultipleLinesForPathWithLeadingNewLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        List<String> lines = Arrays.asList("\n", "line1", "\n", "line2");
        commentsConfiguration.setComment(path, lines);
        assertEquals(lines, commentsConfiguration.comments.get(path));
    }

}
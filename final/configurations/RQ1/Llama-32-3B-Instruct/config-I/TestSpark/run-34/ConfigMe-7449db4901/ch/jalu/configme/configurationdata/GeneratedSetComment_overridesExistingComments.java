package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_overridesExistingComments {

    @Test
    public void setComment_overridesExistingComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        List<String> existingLines = Arrays.asList("existingLine1", "existingLine2");
        commentsConfiguration.setComment(path, existingLines.get(0), existingLines.get(1));
        assertEquals(existingLines, commentsConfiguration.comments.get(path));
    }

}
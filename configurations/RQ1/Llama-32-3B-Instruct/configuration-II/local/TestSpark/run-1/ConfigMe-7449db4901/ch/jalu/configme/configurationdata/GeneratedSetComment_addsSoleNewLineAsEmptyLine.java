package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_addsSoleNewLineAsEmptyLine {

    @Test
    public void setComment_addsSoleNewLineAsEmptyLine() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "\n");
        assertNotNull(commentsConfiguration.comments);
        assertEquals(0, commentsConfiguration.comments.get("path1").size());
    }

}
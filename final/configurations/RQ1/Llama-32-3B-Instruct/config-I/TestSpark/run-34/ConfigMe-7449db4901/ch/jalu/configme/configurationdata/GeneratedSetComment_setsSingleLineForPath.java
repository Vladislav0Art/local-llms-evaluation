package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsSingleLineForPath {

    @Test
    public void setComment_setsSingleLineForPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        List<String> lines = Arrays.asList("\n");
        commentsConfiguration.setComment(path, lines.get(0));
        assertEquals(Collections.singletonList(lines.get(0)), commentsConfiguration.comments.get(path));
    }

}
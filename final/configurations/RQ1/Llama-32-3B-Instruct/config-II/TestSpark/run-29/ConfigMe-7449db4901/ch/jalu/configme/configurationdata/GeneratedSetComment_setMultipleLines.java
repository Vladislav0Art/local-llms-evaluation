package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_setMultipleLines {

    @Test
    public void setComment_setMultipleLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"line1", "line2"};
        config.setComment("path", lines[0], lines[1]);
        assertNotNull(config.comments.get("path"));
        assertEquals(Arrays.asList(lines), config.comments.get("path"));
    }

}
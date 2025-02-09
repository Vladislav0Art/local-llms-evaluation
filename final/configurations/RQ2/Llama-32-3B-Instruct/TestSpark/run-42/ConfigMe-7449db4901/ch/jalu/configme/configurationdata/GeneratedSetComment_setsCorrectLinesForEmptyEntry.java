package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetComment_setsCorrectLinesForEmptyEntry {

    @Test
    public void setComment_setsCorrectLinesForEmptyEntry() {
        Map<String, List<String>> lines = Arrays.asList(
                ""
        );
        CommentsConfiguration config = new CommentsConfiguration(Collections.singletonMap("path1", Collections.emptyList()));
        config.setComment("path1", lines);
        assertEquals(0, config.getAllComments().get("path1").size());
    }

}
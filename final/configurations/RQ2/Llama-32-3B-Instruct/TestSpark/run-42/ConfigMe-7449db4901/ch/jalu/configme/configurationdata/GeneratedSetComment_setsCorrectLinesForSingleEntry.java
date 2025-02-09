package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetComment_setsCorrectLinesForSingleEntry {

    @Test
    public void setComment_setsCorrectLinesForSingleEntry() {
        Map<String, List<String>> lines = Arrays.asList(
                "line1"
        );
        CommentsConfiguration config = new CommentsConfiguration(Collections.singletonMap("path1", Collections.emptyList()));
        config.setComment("path1", lines);
        assertEquals(1, config.getAllComments().get("path1").size());
    }

}
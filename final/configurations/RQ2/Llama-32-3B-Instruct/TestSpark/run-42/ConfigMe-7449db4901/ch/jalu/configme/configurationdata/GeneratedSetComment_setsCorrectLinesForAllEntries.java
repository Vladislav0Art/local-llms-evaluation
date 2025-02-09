package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetComment_setsCorrectLinesForAllEntries {

    @Test
    public void setComment_setsCorrectLinesForAllEntries() {
        Map<String, List<String>> lines = Arrays.asList(
                "",
                "line1",
                "line2"
        );
        CommentsConfiguration config = new CommentsConfiguration(Collections.singletonMap("path1", Collections.emptyList()));
        config.setComment("path1", lines);
        assertEquals(3, config.getAllComments().get("path1").size());
    }

}
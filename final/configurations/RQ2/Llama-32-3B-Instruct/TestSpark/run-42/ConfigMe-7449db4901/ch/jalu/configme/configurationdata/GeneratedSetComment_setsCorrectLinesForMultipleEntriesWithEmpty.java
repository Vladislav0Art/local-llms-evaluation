package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetComment_setsCorrectLinesForMultipleEntriesWithEmpty {

    @Test
    public void setComment_setsCorrectLinesForMultipleEntriesWithEmpty() {
        Map<String, List<String>> lines = Arrays.asList(
                "",
                "line1",
                ""
        );
        CommentsConfiguration config = new CommentsConfiguration(Collections.singletonMap("path1", Collections.emptyList()));
        config.setComment("path1", lines);
        assertEquals(2, config.getAllComments().get("path1").size());
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsNewLinesAsEmptyLines {

    @Test
    public void setComment_setsNewLinesAsEmptyLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("test", "", "");
        assertEquals(Collections.singletonList(""), config.getAllComments().get("test"));
    }

}
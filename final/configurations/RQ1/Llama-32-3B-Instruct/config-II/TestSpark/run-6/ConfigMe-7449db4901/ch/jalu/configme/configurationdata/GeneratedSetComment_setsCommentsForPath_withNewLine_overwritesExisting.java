package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class GeneratedSetComment_setsCommentsForPath_withNewLine_overwritesExisting {

    @Test
    public void setComment_setsCommentsForPath_withNewLine_overwritesExisting() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "\n", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n", "newComment");
        assertEquals(Arrays.asList("newComment"), config.comments.get("path"));
    }

}
package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path1", "line1", "line2");
        configuration.setComment("path2", "", "");
        assertEquals(Collections.unmodifiableMap(comments), configuration.getAllComments());
    }

}
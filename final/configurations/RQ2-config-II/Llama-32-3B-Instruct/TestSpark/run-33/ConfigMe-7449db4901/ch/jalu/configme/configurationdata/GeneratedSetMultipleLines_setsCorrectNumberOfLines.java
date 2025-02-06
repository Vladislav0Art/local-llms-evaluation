package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetMultipleLines_setsCorrectNumberOfLines {

    @Test
    public void setMultipleLines_setsCorrectNumberOfLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path", "line1", "line2", "line3");
        assertEquals(3, configuration.getAllComments().get("path").size());
    }

}
package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetEmptyLine_setsEmptyLineWithoutMarker {

    @Test
    public void setEmptyLine_setsEmptyLineWithoutMarker() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path", "", "line2");
        assertEquals(1, configuration.getAllComments().get("path").size());
    }

}
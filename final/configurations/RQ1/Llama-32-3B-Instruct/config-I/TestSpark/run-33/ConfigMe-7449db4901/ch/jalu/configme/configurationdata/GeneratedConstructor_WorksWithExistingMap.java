package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedConstructor_WorksWithExistingMap {

    @Test
    public void constructor_WorksWithExistingMap() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(existingComments);
        assertEquals(existingComments, config.comments);
    }

}
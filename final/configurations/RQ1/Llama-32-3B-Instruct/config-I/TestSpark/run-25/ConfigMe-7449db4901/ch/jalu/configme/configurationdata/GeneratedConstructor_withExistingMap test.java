package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedConstructor_withExistingMap test {

    @Test
    public void constructor_withExistingMap

    test() {
        Map<String, List<String>> existingMap = new HashMap<>();
        existingMap.put("path", Arrays.asList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingMap);
        assertEquals(existingMap, commentsConfiguration.getComments());
    }

}
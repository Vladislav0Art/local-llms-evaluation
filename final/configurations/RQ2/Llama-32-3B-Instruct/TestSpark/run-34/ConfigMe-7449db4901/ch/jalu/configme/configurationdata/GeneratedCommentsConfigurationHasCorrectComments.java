package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationHasCorrectComments {

    @Test
    public void commentsConfigurationHasCorrectComments() {
        var config = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList("line1", "line2")));
        assertEquals(Collections.singletonMap("path", Collections.unmodifiableList(Arrays.asList("line1", "line2"))), config.getAllComments());
    }

}
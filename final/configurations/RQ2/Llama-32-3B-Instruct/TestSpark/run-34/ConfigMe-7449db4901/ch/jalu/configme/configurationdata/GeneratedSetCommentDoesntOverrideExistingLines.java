package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentDoesntOverrideExistingLines {

    @Test
    public void setCommentDoesntOverrideExistingLines() {
        var config = new CommentsConfiguration(Collections.singletonMap("existingPath", Arrays.asList("existingLine")));
        config.setComment("existingPath", "newLine");
        assertEquals(Collections.singletonMap("existingPath", Arrays.asList("existingLine")), config.getAllComments());
    }

}
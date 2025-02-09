package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsEmpty {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        var config = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

}
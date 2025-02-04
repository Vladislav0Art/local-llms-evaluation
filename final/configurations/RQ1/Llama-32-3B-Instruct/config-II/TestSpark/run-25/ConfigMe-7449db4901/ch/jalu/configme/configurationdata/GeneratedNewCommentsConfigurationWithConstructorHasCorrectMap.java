package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationWithConstructorHasCorrectMap {

    @Test
    public void newCommentsConfigurationWithConstructorHasCorrectMap() {
        Map<String, List<String>> expected = new HashMap<>();
        String[] lines = {"line1", "line2"};
        CommentsConfiguration cfg = new CommentsConfiguration(expected);
        assertTrue(cfg.comments.equals(expected));
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_AddsEmptyEntry {

    @Test
    public void setComment_AddsEmptyEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "\n");
        assertEquals(1, config.comments.size());
        assertEquals(Arrays.asList(), config.comments.get("path1"));
    }

}
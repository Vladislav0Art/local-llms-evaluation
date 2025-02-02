package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_AddsNewEntry {

    @Test
    public void setComment_AddsNewEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1");
        config.setComment("path2", Arrays.asList("line2", "line3"));
        assertEquals(2, config.comments.size());
        assertEquals(Arrays.asList("line1"), config.comments.get("path1"));
        assertEquals(Arrays.asList("line2", "line3"), config.comments.get("path2"));
    }

}
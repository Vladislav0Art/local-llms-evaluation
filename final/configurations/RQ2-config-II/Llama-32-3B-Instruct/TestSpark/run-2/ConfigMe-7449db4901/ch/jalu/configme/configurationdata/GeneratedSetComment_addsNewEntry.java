package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_addsNewEntry {

    @Test
    public void setComment_addsNewEntry() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "", "comment2");
        assertEquals(2, config.getAllComments().size());
    }

}
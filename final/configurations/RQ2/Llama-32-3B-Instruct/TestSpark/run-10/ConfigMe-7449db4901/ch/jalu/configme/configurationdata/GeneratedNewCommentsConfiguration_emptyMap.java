package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_emptyMap {

    @Test
    public void newCommentsConfiguration_emptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.getAllComments());
        assertEquals(0, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}
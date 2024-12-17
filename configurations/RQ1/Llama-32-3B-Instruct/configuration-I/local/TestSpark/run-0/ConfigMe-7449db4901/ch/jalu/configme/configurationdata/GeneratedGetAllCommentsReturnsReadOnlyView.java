package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllCommentsReturnsReadOnlyView {

    @Test
    public void getAllCommentsReturnsReadOnlyView() {
        CommentsConfiguration instance = new CommentsConfiguration();
        Map<String, List<String>> map = instance.getAllComments();
        assertTrue(map instanceof java.util.Map);
        assertFalse(java.util.Collections.unmodifiableMap(map).containsKey("new"));
    }

}
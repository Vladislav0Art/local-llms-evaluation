package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> map = config.getAllComments();
        assertTrue(map instanceof java.util.Map);
        boolean unmodifiable = ((java.util.Map) map).isUnmodifiableKeySet();
        assertTrue(unmodifiable);
        boolean unmodifiableValue = ((java.util.Map) map).isUnmodifiableValues();
        assertTrue(unmodifiableValue);
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class GeneratedGetAllCommentsTestReturnsReadOnlyMapView {

    @Test
    public void getAllCommentsTestReturnsReadOnlyMapView() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = Collections.unmodifiableMap(new HashMap<>());
        assertEquals(expectedComments, configuration.getAllComments());
    }

}
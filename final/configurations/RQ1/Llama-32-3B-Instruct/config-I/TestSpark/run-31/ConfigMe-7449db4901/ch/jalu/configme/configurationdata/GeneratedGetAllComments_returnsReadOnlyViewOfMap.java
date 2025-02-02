package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedGetAllComments_returnsReadOnlyViewOfMap {

    @Test
    public void getAllComments_returnsReadOnlyViewOfMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedCommentMap = Collections.unmodifiableMap(Collections.singletonMap("path", Arrays.asList("line1")));
        assertTrue(config.getAllComments().equals(expectedCommentMap));
    }

}
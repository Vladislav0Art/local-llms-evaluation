package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestSetComment_WithoutComments {

    @Test
    public void testSetComment_WithoutComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test", "line1", "line2");

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(1, result.size());
        assertEquals(2, result.get("test").size());
    }

}
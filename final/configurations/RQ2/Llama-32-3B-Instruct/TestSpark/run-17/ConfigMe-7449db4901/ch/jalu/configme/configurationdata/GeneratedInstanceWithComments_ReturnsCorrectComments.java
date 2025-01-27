package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInstanceWithComments_ReturnsCorrectComments {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void instanceWithComments_ReturnsCorrectComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        assertEquals(comments, instance.getAllComments());
    }

}
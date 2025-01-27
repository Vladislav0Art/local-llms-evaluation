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
public class GeneratedSetComment_OverridingExistingComment {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void setComment_OverridingExistingComment() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        instance.setComment("path1", "line1");
        instance.setComment("path1", "line2");
        assertEquals(Collections.singletonMap("path1", Arrays.asList("line2")), instance.getAllComments());
    }

}
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
public class GeneratedTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void newInstance_ReturnsEmptyComments() {
        CommentsConfiguration instance = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), instance.getAllComments());
    }

    @Test
    public void instanceWithComments_ReturnsCorrectComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        assertEquals(comments, instance.getAllComments());
    }

    @Test
    public void setComment

    SetsCorrectComment() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        instance.setComment("path1", "line1");
        assertEquals(Collections.singletonMap("path1", Arrays.asList("line1")), instance.getAllComments());
    }

    @Test
    public void setComment_EmptyLineResultingInEmptyLine() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        instance.setComment("path1", "", "line2");
        assertEquals(Collections.singletonMap("path1", Arrays.asList("line2")), instance.getAllComments());
    }

    @Test
    public void setComment_OverridingExistingComment() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        instance.setComment("path1", "line1");
        instance.setComment("path1", "line2");
        assertEquals(Collections.singletonMap("path1", Arrays.asList("line2")), instance.getAllComments());
    }

    @Test
    public void setComment_InvalidPath() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        assertFalse(instance.setComment(null, "line1"));
    }

    @Test
    public void setComment_NullLines() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        assertThrows(NullPointerException.class, () -> instance.setComment("path1", null));
    }

    @Test
    public void setComment_NullLinesNotThrowing() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        Supplier<List<String>> supplier = () -> Arrays.asList("line1");
        assertFalse(instance.setComment("path1", null, supplier.get()));
    }

    @Test
    public void setComment_NullLinesAndSupplier() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        Supplier<List<String>> supplier = () -> Arrays.asList("line1");
        assertFalse(instance.setComment("path1", null, supplier));
    }

    @Test
    public void setComment_EmptyLinesAndSupplier() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        Supplier<List<String>> supplier = () -> Arrays.asList("line1");
        assertFalse(instance.setComment("path1", "", supplier.get()));
    }

    @Test
    public void setComment_EmptyLinesAndSupplierNotThrowing() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        Supplier<List<String>> supplier = () -> Arrays.asList("line1");
        assertFalse(instance.setComment("path1", "", supplier));
    }

}
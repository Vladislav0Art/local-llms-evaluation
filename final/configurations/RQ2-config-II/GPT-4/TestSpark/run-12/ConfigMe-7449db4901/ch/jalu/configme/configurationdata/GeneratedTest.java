package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapWithSize.aMapWithSize;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void ConstructorWithoutParameterTest() {
        CommentsConfiguration cc = new CommentsConfiguration();
        assertTrue(cc.getAllComments().isEmpty());
    }

    @Test
    public void ConstructorWithParameterTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("sample_path", Collections.singletonList("Sample comment"));
        CommentsConfiguration cc = new CommentsConfiguration(comments);
        assertThat(cc.getAllComments(), hasEntry("sample_path", Collections.singletonList("Sample comment")));
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration cc = new CommentsConfiguration();
        cc.setComment("new_path", "New comment");
        Map<String, List<String>> allComments = cc.getAllComments();
        assertThat(allComments, aMapWithSize(1));
        assertThat(allComments, hasEntry("new_path", Collections.singletonList("New comment")));
    }

    @Test
    public void setCommentWithMultipleLinesTest() {
        CommentsConfiguration cc = new CommentsConfiguration();
        cc.setComment("new_path", "First comment", "Second comment");
        Map<String, List<String>> allComments = cc.getAllComments();
        assertThat(allComments, aMapWithSize(1));
        assertThat(allComments, hasEntry("new_path", Arrays.asList("First comment", "Second comment")));
    }

    @Test
    public void setCommentOverridingTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("sample_path", Collections.singletonList("Sample comment"));
        CommentsConfiguration cc = new CommentsConfiguration(comments);
        cc.setComment("sample_path", "Another comment");
        Map<String, List<String>> allComments = cc.getAllComments();
        assertThat(allComments, hasEntry("sample_path", Collections.singletonList("Another comment")));
    }

}
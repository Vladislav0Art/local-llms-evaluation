package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_overridesExistingComment {

    @Test
    public void setComment_overridesExistingComment() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment"));
        Mockito.when(SettingsHolder.getPriorPath()).thenReturn("path1");

        // when
        config.setComment(Mockito.anyString(), "newComment");
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();

        // then
        assertEquals(comments, actualComments);
    }

}
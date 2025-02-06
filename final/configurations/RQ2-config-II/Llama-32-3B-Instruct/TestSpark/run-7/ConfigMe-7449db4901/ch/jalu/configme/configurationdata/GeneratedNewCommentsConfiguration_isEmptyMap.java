package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedNewCommentsConfiguration_isEmptyMap {

    @Test
    public void newCommentsConfiguration_isEmptyMap() {
        // given
        Map<String, List<String>> comments = new HashMap<>();

        // when
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // then
        assertEquals(0, config.getAllComments().size());
    }

}
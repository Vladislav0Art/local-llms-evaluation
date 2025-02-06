package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedNewCommentsConfiguration_hasValidLines {

    @Test
    public void newCommentsConfiguration_hasValidLines() {
        // given
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Arrays.asList("line1", "line2"));

        // when
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // then
        assertEquals(2, config.getAllComments().get(path).size());
    }

}
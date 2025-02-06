package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedSetComment_overwritesExistingComments {

    @Test
    public void setComment_overwritesExistingComments() {
        // given
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path";
        List<String> existingLines = Arrays.asList("line1");
        comments.put(path, existingLines);

        CommentsConfiguration configBefore = new CommentsConfiguration(comments);
        CommentsConfiguration configAfter = new CommentsConfiguration(new HashMap<>());

        // when
        configBefore.setComment(path, "new-line", "commented-line");

        // then
        assertEquals(2, configAfter.getAllComments().get(path).size());
    }

}
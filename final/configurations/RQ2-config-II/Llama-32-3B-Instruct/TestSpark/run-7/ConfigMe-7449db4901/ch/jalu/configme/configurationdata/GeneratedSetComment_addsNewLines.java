package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedSetComment_addsNewLines {

    @Test
    public void setComment_addsNewLines() {
        // given
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path";
        List<String> existingLines = Arrays.asList("line1");
        comments.put(path, existingLines);

        CommentsConfiguration configBefore = new CommentsConfiguration(comments);
        CommentsConfiguration configAfter = new CommentsConfiguration(new HashMap<>());

        // when
        configBefore.setComment(path, "", "commented-line");

        // then
        assertEquals(3, configAfter.getAllComments().get(path).size());
    }

}
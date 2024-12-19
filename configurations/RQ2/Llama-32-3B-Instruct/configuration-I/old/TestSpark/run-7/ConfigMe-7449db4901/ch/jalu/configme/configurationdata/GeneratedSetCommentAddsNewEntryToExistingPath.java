package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.*;

@RunWith(PowerMockRunner.class)
public class GeneratedSetCommentAddsNewEntryToExistingPath {

    @Test
    public void setCommentAddsNewEntryToExistingPath() {
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        configuration.setComment("path", commentLines);
        Map<String, List<String>> allComments = configuration.getAllComments();
        assertTrue(allComments.containsKey("path"));
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyMap;

public class GeneratedSetComment_overwritesExistingEntry {

    @Test
    public void setComment_overwritesExistingEntry() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "newLine");
        assertEquals(1, ((List<String>) configuration.comments.get("path1")).size());
    }

}
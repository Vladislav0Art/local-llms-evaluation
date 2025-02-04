package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyMap;

public class GeneratedSetComment_addsNewEntry {

    @Test
    public void setComment_addsNewEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "line1");
        assertEquals(1, configuration.comments.size());
        assertEquals(1, ((List<String>) configuration.comments.get("path1")).size());
    }

}
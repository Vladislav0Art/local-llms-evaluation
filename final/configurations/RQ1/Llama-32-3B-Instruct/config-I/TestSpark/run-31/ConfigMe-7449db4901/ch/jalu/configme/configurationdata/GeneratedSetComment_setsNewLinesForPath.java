package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedSetComment_setsNewLinesForPath {

    @Test
    public void setComment_setsNewLinesForPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "\n", "new-line");
        assertTrue(config.comments.get("path1").contains("\n"));
        assertFalse(config.comments.get("path1").isEmpty());
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedSetComment_setsEmptyLineWithoutMarkerForNewLine {

    @Test
    public void setComment_setsEmptyLineWithoutMarkerForNewLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path3", "\n");
        List<String> commentLines = config.comments.get("path3");
        assertEquals(1, commentLines.size());
        assertFalse(commentLines.contains(""));
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedSetComment_setsMultipleLinesForPath {

    @Test
    public void setComment_setsMultipleLinesForPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path2", "\n", "line1\nnew-line");
        List<String> commentLines = config.comments.get("path2");
        assertEquals(2, commentLines.size());
        assertTrue(commentLines.contains("\n"));
    }

}
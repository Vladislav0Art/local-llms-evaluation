package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedSetMultipleComments_forPath_setsMultipleLines {

    @Test
    public void setMultipleComments_forPath_setsMultipleLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path4", "line1\nnew-line");
        List<String> commentLines = config.comments.get("path4");
        assertEquals(2, commentLines.size());
    }

}
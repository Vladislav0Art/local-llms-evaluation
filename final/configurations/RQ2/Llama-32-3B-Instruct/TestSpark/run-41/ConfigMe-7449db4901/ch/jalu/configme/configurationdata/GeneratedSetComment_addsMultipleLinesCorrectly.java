package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetComment_addsMultipleLinesCorrectly {

    @Test
    public void setComment_addsMultipleLinesCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        commentsConfig.setComment("path1", "line1", "line2");
        assertEquals(2, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().get("path1").containsAll(Arrays.asList("line1", "line2")));
    }
}

class SettingsHolder {
    public static CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration();
    }

}
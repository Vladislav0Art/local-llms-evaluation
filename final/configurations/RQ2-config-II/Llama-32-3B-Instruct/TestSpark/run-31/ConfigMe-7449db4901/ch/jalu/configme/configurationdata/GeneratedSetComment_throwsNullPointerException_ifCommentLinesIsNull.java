package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_throwsNullPointerException_ifCommentLinesIsNull {

    @Test
    public void setComment_throwsNullPointerException_ifCommentLinesIsNull() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "line2"));
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment("path", null));
    }

}
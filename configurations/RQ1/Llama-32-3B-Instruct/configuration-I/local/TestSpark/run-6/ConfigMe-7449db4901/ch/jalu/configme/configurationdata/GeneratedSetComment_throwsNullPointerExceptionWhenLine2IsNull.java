package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_throwsNullPointerExceptionWhenLine2IsNull {

    @Test
    public void setComment_throwsNullPointerExceptionWhenLine2IsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        List<String> existingLines = Collections.singletonList("line1");

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(path, "line1", null));
    }

}
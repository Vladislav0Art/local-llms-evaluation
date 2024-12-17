package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_throwsNullPointerExceptionWhenCommentsIsNull {

    @Test
    public void setComment_throwsNullPointerExceptionWhenCommentsIsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(path, null, "line2"));
    }

}
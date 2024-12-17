package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_throwsNullPointerExceptionWhenMapIsNull {

    @Test
    public void getAllComments_throwsNullPointerExceptionWhenMapIsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.getAllComments());
    }

}
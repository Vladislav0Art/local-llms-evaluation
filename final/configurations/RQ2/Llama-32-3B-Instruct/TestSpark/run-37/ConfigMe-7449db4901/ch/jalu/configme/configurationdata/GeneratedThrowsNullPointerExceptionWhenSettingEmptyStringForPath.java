package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedThrowsNullPointerExceptionWhenSettingEmptyStringForPath {

    @Test
    public void throwsNullPointerExceptionWhenSettingEmptyStringForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Assertions.assertThrows(NullPointerException.class, () -> commentsConfig.setComment("", null));
    }

}
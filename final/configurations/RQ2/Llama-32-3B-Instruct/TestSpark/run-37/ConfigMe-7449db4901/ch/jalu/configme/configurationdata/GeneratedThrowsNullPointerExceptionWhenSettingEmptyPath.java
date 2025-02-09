package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.SpyBean;
import org.assertj.core.api.Assertions;

public class GeneratedThrowsNullPointerExceptionWhenSettingEmptyPath {

    @Test
    public void throwsNullPointerExceptionWhenSettingEmptyPath() {
        CommentsConfiguration commentsConfig = Mockito.spy(new CommentsConfiguration());
        Mockito.when(commentsConfig.setComment(Mockito.anyString(), Mockito.anyString())).thenThrow(NullPointerException.class);
        Assertions.assertThrows(NullPointerException.class, () -> commentsConfig.setComment("", null));
    }

}
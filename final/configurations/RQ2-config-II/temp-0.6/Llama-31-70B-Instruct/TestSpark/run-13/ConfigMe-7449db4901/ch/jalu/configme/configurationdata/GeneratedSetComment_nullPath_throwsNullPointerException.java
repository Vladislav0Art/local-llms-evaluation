package ch.jalu.configme.configurationdata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GeneratedSetComment_nullPath_throwsNullPointerException {

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment(null, "commentA"));
    }

}
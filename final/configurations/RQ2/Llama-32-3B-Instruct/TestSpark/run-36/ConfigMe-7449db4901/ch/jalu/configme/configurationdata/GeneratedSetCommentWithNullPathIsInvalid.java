package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetCommentWithNullPathIsInvalid {

    @Test
    public void setCommentWithNullPathIsInvalid() {
        Assertions.assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment(null, new String[0]));
    }
}

}
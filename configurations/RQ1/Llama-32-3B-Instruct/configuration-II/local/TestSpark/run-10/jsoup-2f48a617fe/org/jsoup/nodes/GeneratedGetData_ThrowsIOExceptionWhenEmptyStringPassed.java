package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetData_ThrowsIOExceptionWhenEmptyStringPassed {

    @Test
    public void getData_ThrowsIOExceptionWhenEmptyStringPassed() throws IOException {
        // [MethodUnderTest][Scenario]Test
        try {
            new Comment("").getData();
            assertThat(false, is(true));
        } catch (IOException e) {
            assertThat(e.getMessage(), is("Input cannot be null or empty"));
        }
    }

}
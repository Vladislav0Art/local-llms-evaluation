package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedStripLeadingWhitespaceShouldRemoveLeadingWhitespaceFromText {

    @Test
    public void stripLeadingWhitespaceShouldRemoveLeadingWhitespaceFromText() {
        String text = "   Hello World";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertThat(result, is("Hello World"));
    }

}
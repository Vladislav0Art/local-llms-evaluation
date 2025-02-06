package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedNormaliseWhitespaceShouldReturnStringWithoutLeadingWhitespace {

    @Test
    public void normaliseWhitespaceShouldReturnStringWithoutLeadingWhitespace() {
        String text = "   Hello World";
        String result = StringUtil.normaliseWhitespace(text);
        assertThat(result, is("Hello World"));
    }

}
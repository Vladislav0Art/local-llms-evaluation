package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedLastCharIsWhitespaceShouldReturnFalseForNonWhitespaceCharacter {

    @Test
    public void lastCharIsWhitespaceShouldReturnFalseForNonWhitespaceCharacter() {
        StringBuilder sb = new StringBuilder("H");
        boolean result = StringUtil.lastCharIsWhitespace(sb);
        assertThat(result, is(false));
    }

}
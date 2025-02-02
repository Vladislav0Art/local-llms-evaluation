package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedCreateFromEncoded_throwsNullPointerException {

    @Test
    public void createFromEncoded_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> TextNode.createFromEncoded(null));
    }

}
package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedShould_return_true_for_public_method {

    public int publicMethod() {
        return 42;
    }

    @Test
    public void should_return_true_for_public_method() {
        assertThat(Public.publicMethod(), is(true));
    }

}
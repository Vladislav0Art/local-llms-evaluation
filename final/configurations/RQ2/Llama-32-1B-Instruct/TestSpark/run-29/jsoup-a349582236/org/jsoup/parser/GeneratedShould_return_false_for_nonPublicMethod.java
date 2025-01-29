package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedShould_return_false_for_nonPublicMethod {

    public int publicMethod() {
        return 42;
    }

    @Test
    public void should_return_false_for_nonPublicMethod() {
        assertNotSame(Public.publicMethod, null);
        assertNotSame(Public.publicMethod, "Hello");
    }

}
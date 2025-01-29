package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedShould_return_the_same_value_from_public_method_if_it_is_a_static_variable {

    public int publicMethod() {
        return 42;
    }

    @Test
    public void should_return_the_same_value_from_public_method_if_it_is_a_static_variable() {
        System.out.println(Public.staticVariable);
        assertThat(Public.staticVariable, is(42));
    }

    static class TestClass {

        public int staticVariable = 42;

        public String publicMethod() {
            return "Hello";
        }
    }

}
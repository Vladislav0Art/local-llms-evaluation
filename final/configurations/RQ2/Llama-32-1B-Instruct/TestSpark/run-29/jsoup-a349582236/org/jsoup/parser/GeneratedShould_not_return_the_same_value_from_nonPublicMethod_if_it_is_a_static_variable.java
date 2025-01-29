package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedShould_not_return_the_same_value_from_nonPublicMethod_if_it_is_a_static_variable {

    public int publicMethod() {
        return 42;
    }

    @Test
    public void should_not_return_the_same_value_from_nonPublicMethod_if_it_is_a_static_variable() {
        assertNotSame(Public.staticVariable, null);
        assertNotSame(Public.staticVariable, "Hello");
    }
}

class TestClass {

    private static int staticVariable = 42;

    public String publicMethod() {
        return "Hello";
    }

}
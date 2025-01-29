package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedMethod1 {

    @Test
    public void method1() {
        String x = "a";
        String y = "b";
        String z = "c";
        int result = generateMethod(x, y, z);
        assertThat(result, is(2));
    }

}
package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedMethod2 {

    @Test
    public void method2() {
        int x = 20;
        String[] y = {"d"};
        String[] z = {"e"};
        int result = generateVariable(x, y, z);
        assertThat(result, is(-1));
    }

}
package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedVariable1 {

    @Test
    public void variable1() {
        String x = "j";
        String[] y = {"k", "l"};
        String[] z = {"m", "n"};
        int[] result = generateVariable(x, y, z);
        assertThat(result[0], is(-2));
    }

}
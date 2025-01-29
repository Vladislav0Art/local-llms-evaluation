package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedVariable2 {

    @Test
    public void variable2() {
        String x = "o";
        String[] y = new String[]{};
        String[] z = new String[]{"p"};
        int[] result = generateVariable(x, y, z);
        assertThat(result[0], is(-1));
    }

}
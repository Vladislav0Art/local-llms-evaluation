package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        int count = dataFrame.columnCount();
        MatcherAssert.assertThat(count, Matchers.equalTo(1));
    }

}
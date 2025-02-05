package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetAggregateIndexTest {

    @Test
    public void getAggregateIndexTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        dataFrame.addRow(Arrays.asList(new Value("value")));
        IntList aggregateIndex = dataFrame.getAggregateIndex(0);
        MatcherAssert.assertThat(aggregateIndex, Matchers.notNullValue());
    }

}
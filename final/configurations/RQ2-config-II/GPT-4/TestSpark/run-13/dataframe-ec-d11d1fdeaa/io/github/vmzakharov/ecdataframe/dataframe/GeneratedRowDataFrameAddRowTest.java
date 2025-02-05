package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRowDataFrameAddRowTest {

    @Test
    public void rowDataFrameAddRowTest() {
        ListIterable<Value> rowValues = Mockito.mock(ListIterable.class);
        DataFrame dataFrame = new DataFrame("test");
        DataFrame returnedDataFrame = dataFrame.addRow(rowValues);
        MatcherAssert.assertThat(returnedDataFrame, Matchers.equalTo(dataFrame));
    }

}
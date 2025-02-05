package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAddColumnWithValueTypeTest {

    @Test
    public void addColumnWithValueTypeTest() {
        DataFrame dataFrame = new DataFrame("test");
        ValueType type = ValueType.BOOLEAN;
        DataFrame returnedDataFrame = dataFrame.addColumn("columnName", type);
        MatcherAssert.assertThat(returnedDataFrame, Matchers.equalTo(dataFrame));
    }

}
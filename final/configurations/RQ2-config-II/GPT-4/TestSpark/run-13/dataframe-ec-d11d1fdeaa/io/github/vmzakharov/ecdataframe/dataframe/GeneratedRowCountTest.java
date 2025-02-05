package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRowCountTest {

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        dataFrame.addRow(Arrays.asList(new Value("value")));
        int rowCount = dataFrame.rowCount();
        MatcherAssert.assertThat(rowCount, Matchers.equalTo(1));
    }

}
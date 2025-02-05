package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetStringColumnTest {

    @Test
    public void getStringColumnTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        DfStringColumn stringColumn = dataFrame.getStringColumn("stringColumn");
        MatcherAssert.assertThat(stringColumn.getName(), Matchers.equalTo("stringColumn"));
    }

}
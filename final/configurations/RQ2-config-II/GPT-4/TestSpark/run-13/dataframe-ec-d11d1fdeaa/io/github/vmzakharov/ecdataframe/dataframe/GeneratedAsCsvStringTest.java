package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsCsvStringTest {

    @Test
    public void asCsvStringTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        dataFrame.addRow(Arrays.asList(new Value("value")));
        String csv = dataFrame.asCsvString();
        MatcherAssert.assertThat(csv, Matchers.not(Matchers.isEmptyOrNullString()));
    }

}
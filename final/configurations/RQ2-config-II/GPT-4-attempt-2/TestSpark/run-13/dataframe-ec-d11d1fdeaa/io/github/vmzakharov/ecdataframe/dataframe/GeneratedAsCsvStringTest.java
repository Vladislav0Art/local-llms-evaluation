package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.ExpressionParserHelper;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.tuple.Tuples;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsCsvStringTest {

    @Test
    public void asCsvStringTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow(Lists.mutable.of(ExpressionParserHelper.toValue("Value1")));
        String csv = dataFrame.asCsvString();
        Assert.assertEquals("Column1\nValue1\n", csv);
    }

}
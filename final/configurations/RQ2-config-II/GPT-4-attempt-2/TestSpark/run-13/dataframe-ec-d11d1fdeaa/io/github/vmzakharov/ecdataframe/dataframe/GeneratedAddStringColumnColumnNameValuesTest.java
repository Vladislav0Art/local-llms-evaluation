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

public class GeneratedAddStringColumnColumnNameValuesTest {

    @Test
    public void addStringColumnColumnNameValuesTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addStringColumn("Column1", Lists.mutable.of("Value1", "Value2"));
        Assert.assertEquals("Test", result.getName());
    }

}
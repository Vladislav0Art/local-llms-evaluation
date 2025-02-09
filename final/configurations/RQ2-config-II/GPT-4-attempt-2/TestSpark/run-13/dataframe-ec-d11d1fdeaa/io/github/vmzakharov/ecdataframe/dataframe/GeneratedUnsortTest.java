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

public class GeneratedUnsortTest {

    @Test
    public void unsortTest() {
        String expectedName = "Test";
        DataFrame mockDataFrame = Mockito.mock(DataFrame.class);
        Mockito.doCallRealMethod().when(mockDataFrame).unsort();
        mockDataFrame.unsort();
        Mockito.verify(mockDataFrame).unsort();
    }

}
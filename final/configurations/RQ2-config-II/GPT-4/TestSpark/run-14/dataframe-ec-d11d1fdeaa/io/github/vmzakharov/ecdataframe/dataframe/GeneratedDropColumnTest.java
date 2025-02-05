package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.primitive.IntInterval;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDropColumnTest {

    @Test
    public void dropColumnTest() {
        DataFrame dataframe = new DataFrame("test");
        dataframe.addStringColumn("Column1");
        dataframe.dropColumn("Column1");
        Assert.assertFalse(dataframe.hasColumn("Column1"));
    }

}
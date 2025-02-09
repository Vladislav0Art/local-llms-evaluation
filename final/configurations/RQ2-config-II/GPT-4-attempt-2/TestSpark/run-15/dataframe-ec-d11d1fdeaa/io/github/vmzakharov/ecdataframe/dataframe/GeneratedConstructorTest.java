package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        Assert.assertEquals("TestFrame", dataFrame.getName());
    }

}
package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveFromColumnTest {

    @Test
    public void removeFromColumnTest() {
        DataFrame base = new DataFrame("base");
        base.addStringColumn("test");
        base.addRow(Lists.mutable.with(ValueType.STRING.newValue("Hello")));
        base.dropColumn("test");
        Assert.assertFalse(base.hasColumn("test"));
    }

}
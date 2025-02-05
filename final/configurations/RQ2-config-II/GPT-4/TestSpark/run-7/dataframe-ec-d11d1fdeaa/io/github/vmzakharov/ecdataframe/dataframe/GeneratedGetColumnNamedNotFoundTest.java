package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedGetColumnNamedNotFoundTest {

    @Test
    public void getColumnNamedNotFoundTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");

        dataFrame.getColumnNamed("WrongName"); // throws exception
    }

}
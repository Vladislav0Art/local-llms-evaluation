package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedSetObjectTest {

    @Test
    public void setObjectTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow();
        dataFrame.getObject(0, 0);
    }

}
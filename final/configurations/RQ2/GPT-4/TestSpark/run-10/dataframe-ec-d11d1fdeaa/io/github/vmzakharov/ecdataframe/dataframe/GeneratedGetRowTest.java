package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedGetRowTest {

    @Test
    public void getRowTest() {
        //Creating a mock object
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.getRow(0);
        verify(dataFrame).getRow(0);
    }

}
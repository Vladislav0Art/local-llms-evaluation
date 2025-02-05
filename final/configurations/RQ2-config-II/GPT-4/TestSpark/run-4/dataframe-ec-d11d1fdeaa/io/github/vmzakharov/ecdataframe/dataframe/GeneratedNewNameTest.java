package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedNewNameTest {

    @Test
    public void newNameTest() {
        String newName = "newName";
        DataFrame dataFrame = new DataFrame(newName);
        assertEquals(newName, dataFrame.getName());
    }

}
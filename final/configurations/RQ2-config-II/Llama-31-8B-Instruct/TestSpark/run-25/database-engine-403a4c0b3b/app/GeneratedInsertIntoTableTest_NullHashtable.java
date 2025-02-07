package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertIntoTableTest_NullHashtable {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void insertIntoTableTest_NullHashtable() throws DBAppException {
        dbApp.insertIntoTable("table1", null);
    }

}
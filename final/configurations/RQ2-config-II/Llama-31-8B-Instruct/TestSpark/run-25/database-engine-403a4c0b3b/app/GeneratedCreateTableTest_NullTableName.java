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
public class GeneratedCreateTableTest_NullTableName {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void createTableTest_NullTableName() throws DBAppException {
        dbApp.createTable(null, "column1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}
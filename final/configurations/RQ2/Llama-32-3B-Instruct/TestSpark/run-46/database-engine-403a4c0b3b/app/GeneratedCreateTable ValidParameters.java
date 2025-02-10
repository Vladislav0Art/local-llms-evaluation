package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTable ValidParameters {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void createTable

    ValidParameters() {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable("table1", "column1", htblColNameType, htblClusteringKeyColumn, htblColNameMin);
    }

}
package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Generated[createEmptyRootEntries]

Test_createEmptyRootEntries {

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder(rootEntries);

    @Test
    public void [createEmptyRootEntries]Test_createEmptyRootEntries() {
        Map<String, Object> emptyMap = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder(emptyMap);
        List<Property<?>> result = builder.create();
        assertTrue(result.isEmpty());
    }

}
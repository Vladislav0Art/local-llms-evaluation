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
public class Generated[addValidProperty]

Test_addValidProperty {

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder(rootEntries);

    @Test
    public void [addValidProperty]Test_addValidProperty() {
        Property<?> property = new Property<>("test", "value");
        propertyListBuilder.add(property);
        assertNotNull(propertyListBuilder.getRootEntries());
    }

}
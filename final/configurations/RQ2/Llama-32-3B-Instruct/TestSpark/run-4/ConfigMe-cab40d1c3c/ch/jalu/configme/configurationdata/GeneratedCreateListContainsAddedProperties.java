package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateListContainsAddedProperties {

    @Test
    public void createListContainsAddedProperties() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = new LinkedHashMap<>();
        List<Property<?>> list = new ArrayList<>();

        when(builder.getRootEntries()).thenReturn(map);

        Property<?> property1 = new Property<>("name1", "value1");
        Property<?> property2 = new Property<>("name2", "value2");
        builder.add(property1);
        builder.add(property2);

        assertEquals(2, builder.create().size());
    }

}
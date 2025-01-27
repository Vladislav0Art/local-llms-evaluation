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

public class GeneratedCreateListNotContainsEmptyProperties {

    @Test
    public void createListNotContainsEmptyProperties() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = new LinkedHashMap<>();
        List<Property<?>> list = new ArrayList<>();

        when(builder.getRootEntries()).thenReturn(map);

        Property<?> property1 = new Property<>("name", "value");
        Property<?> property2 = new Property<>("name", "");
        builder.add(property1);
        builder.add(property2);

        assertEquals(0, builder.create().stream()
                .filter(p -> !p.getValue().isEmpty())
                .count());
    }

}
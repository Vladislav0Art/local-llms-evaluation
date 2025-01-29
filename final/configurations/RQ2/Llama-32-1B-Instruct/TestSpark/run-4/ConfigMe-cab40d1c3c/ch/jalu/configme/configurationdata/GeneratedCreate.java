package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedCreate {

    public List<Property<?>> addProperty(Property<?> property) {
        return Collections.singletonList(property);
    }

    @Test
    public void create() {
        List<Property<?>> properties = new ArrayList<>();
        assertTrue(addProperty("testProperty").add(properties));
        assertEquals(1, properties.size());
    }

}
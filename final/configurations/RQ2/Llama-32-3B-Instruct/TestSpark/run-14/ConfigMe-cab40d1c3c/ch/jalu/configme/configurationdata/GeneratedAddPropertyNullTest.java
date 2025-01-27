package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyNullTest {

    @Test
    public void addPropertyNullTest() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(null);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }
        assertEquals(0, ((PropertyListBuilder) new PropertyListBuilder()).create().size());
    }

}
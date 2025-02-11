package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddDuplicatePropertyTest {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addDuplicatePropertyTest() {
        try {
            builder.add(new Property<>("DataSource", "mysql"));
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // expected
        }
    }

}
package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.*;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(null);
    }

}
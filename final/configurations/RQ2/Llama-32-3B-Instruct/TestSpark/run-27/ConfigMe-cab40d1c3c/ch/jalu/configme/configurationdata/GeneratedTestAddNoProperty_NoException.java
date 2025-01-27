package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddNoProperty_NoException {

    @Test
    public void testAddNoProperty_NoException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(null);
        assertNull(builder.create());
    }

}
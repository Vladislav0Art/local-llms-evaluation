package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedSetComment_setsMultipleLinesForPath {

    @Test
    public void setComment_setsMultipleLinesForPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"line1", "line2", "\n"};
        config.setComment("path", lines);
        assertEquals(Arrays.asList(lines), config.comments.get("path"));
    }
}
		
		package ch.jalu.configme.configurationdata;
		
		import org.junit.Test;
		import static org.junit.Assert .*;
        import java.util.Arrays;
		import java.util.Collections;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;
		import org.mockito.Mock;
		import org.mockito.MockitoAnnotations;

public class CommentsConfigurationTestWithMock {

    @Mock
    private Map<String, List<String>> existingMap;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        existingMap.put("path", Arrays.asList("line1"));
    }

}
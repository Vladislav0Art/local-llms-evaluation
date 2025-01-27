package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void testPut() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        assertEquals(1, commentMap.size());
    }

    @Test
    public void testArrayEquals() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        assertTrue(!Arrays.equals(Arrays.asList(commentMap.get("path1")), Arrays.asList(commentMap.get("path1"))));
    }

    @Test
    public void testAssertNotEquals() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        assertTrue(!new HashMap<>(commentMap).equals(new HashMap<>()));
    }
}

@Test
public void testHashMap() throws Exception {
    Map<String, List<String>> commentMap = new HashMap<>();
    commentMap.put("path1", Arrays.asList("commentLine1"));
    assertEquals(1, commentMap.size());
    assertTrue(!Arrays.equals(Arrays.asList(commentMap.get("path1")), Arrays.asList(commentMap.get("path1"))));
}
	}

@Test
public void testPut() throws Exception {
    Map<String, List<String>> commentsMap = new HashMap<>();
    commentsMap.put("path1", Arrays.asList("commentLine1"));
    assertEquals(1, commentsMap.size());
}

@Test
public void testEquals() throws Exception {
    Map<String, List<String>> commentsMap = new HashMap<>();
    commentsMap.put("path1", Arrays.asList("commentLine1"));
    assertTrue(!commentsMap.equals(new HashMap<>()));
}
	}

@Test
public void testAssertNotEquals() throws Exception {
    Map<String, List<String>> commentMap = new HashMap<>();
    commentMap.put("path1", Arrays.asList("commentLine1"));
    assertTrue(!Arrays.equals(Arrays.asList(commentMap.get("path1")), Arrays.asList(commentMap.get("path1"))));
}
	}

@Test
public void testAssertNotEquals() throws Exception {
    Map<String, List<String>> commentMap = new HashMap<>();
    commentMap.put("path1", Arrays.asList("commentLine1"));
    assertTrue(!Arrays.equals(Arrays.asList(commentMap.get("path1")), Arrays.asList(commentMap.get("path1"))));
}

}
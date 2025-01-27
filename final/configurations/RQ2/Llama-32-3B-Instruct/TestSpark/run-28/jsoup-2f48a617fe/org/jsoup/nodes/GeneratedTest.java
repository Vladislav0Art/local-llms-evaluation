package org.jsoup.nodes;

public class GeneratedTest {

    private String testAttribute;

    @PublicTest
    public void setAttribute(String attribute) {
        this.testAttribute = attribute;
    }

    @PublicTest
    public String getAttribute() {
        return testAttribute;
    }
}

public class PublicTestClass1 {
    public TestClass1 testClass1;

    @PublicTest
    public void setTestClass1(TestClass1 testClass1) {
        this.testClass1 = testClass1;
    }

    public void printTestClass1() {
        if (testClass1 != null) {
            System.out.println(testClass1.getAttribute());
        } else {
            System.out.println("No TestClass1 assigned");
        }
    }
}

public class PublicTestClass2 {
    private final TestClass1 testClass1;

    @PublicTest
    public void setTestClass1(TestClass1 testClass1) {
        this.testClass1 = testClass1;
    }

    public String getTestClass1() {
        return testClass1 != null ? testClass1.getAttribute() : "No TestClass1 assigned";
    }
}

@PublicTest
public class PublicTestInterface {
    public void doSomething() {
        System.out.println("Doing something");
    }
}

public class GeneratedTest {
    private final PublicTestClass2 testClass2;

    @Before
    public void setUp() {
        this.testClass2 = new PublicTestClass2();
    }

    @Test
    public void constructorCommentNotNull() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
    }

    @Test
    public void nodeNameCommentNotNull() {
        Comment comment = new Comment("data");
        assertNotNull(comment.nodeName());
    }

    @Test
    public void getDataCommentNotNull() {
        Comment comment = new Comment("data");
        assertNotNull(comment.getData());
    }

    @Test
    public void setDataCommentNotNull() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertNotNull(comment.getData());
    }

    @Test
    public void toStringCommentNotCalled() {
        Comment comment = new Comment("data");
        assertNotNull(comment.toString());
    }

    @Test
    public void cloneCommentNotNull() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
    }

    @Test
    public void isXmlDeclarationCommentFalse() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationCommentNullWhenIsXmlDeclarationFalse() {
        Comment comment = new Comment("data");
        assertNotNull(comment.asXmlDeclaration());
        assertTrue(comment.isXmlDeclaration());
    }

}
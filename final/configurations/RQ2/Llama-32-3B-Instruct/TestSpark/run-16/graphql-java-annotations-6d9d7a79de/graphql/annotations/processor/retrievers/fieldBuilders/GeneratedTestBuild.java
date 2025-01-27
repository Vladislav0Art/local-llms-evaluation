package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestBuild {

    public String getRequiredField(Object object, String name) throws Exception {
        return (String) ((Method) java.lang.reflect.Method.class.cast(object.getClass().getMethod(name))).invoke(null);
    }

    public void build(DirectiveMock directivesMock, String directiveName, List<DirectiveMock> mockList) {
        mockList.add(directivesMock);
    }
}

class DirectiveMock {

    public static class GraphQLDirective {
    }

    public static final String DIRECTIVE_NAME = "";

    @Test
    public void testBuild() {
        DirectiveMock directivesMock = new DirectiveMock();
        List<DirectiveMock> mockList = new ArrayList<>();
        DirectiveJavaAnnotationUtil.build(directivesMock, "directives", mockList);
        assertEquals(1, mockList.size());
    }
}

}
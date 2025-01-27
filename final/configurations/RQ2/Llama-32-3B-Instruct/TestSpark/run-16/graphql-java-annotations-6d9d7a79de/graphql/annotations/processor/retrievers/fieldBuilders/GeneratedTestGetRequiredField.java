package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetRequiredField {

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
    public void testGetRequiredField() throws Exception {
        Object object = new Object();
        String result = DirectiveJavaAnnotationUtil.getRequiredField(object, "directives");
        System.out.println(result);
    }

}
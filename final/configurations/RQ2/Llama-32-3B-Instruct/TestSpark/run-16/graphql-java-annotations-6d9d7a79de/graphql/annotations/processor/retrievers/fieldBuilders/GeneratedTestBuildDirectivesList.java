package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class GeneratedTestBuildDirectivesList {

    @Mock
    public AnnotatedElement object;

    @Test
    public void testBuildDirectivesList() throws Exception {
        Mockito.when(GraphQLDirectives.class).ofType(DirectiveMock.class);
        Object directivesMock = Mockito.mock(AnnotatedElement.class);

        ArrayList<DirectiveMock> mockList = new ArrayList<>();
        DirectiveJavaAnnotationUtil.build(directivesMock, "directives", mockList);
    }
}

class DirectiveMock {
    public static class GraphQLDirective {
    }

}
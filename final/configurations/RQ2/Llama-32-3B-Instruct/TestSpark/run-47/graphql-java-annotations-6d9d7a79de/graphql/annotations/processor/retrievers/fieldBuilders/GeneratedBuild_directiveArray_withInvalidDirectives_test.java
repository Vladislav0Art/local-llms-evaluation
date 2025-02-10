package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.mockito.Mockito;

public class GeneratedBuild_directiveArray_withInvalidDirectives_test {

    @Test
    public void build_directiveArray_withInvalidDirectives_test() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        // mock invalid directives list
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        try {
            GraphQLDirective[] result = builder.build();
            fail("Expected exception");
        } catch (GraphQLAnnotationsException e) {
            assertNotNull(e);
        }
    }

}
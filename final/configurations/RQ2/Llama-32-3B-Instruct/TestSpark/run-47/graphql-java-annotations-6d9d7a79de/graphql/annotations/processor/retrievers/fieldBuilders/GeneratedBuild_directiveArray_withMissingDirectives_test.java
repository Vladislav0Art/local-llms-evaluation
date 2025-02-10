package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.mockito.Mockito;

public class GeneratedBuild_directiveArray_withMissingDirectives_test {

    @Test
    public void build_directiveArray_withMissingDirectives_test() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        assertEquals(0, result.length);
    }

}
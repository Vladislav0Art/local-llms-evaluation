package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.mockito.Mockito;

public class GeneratedBuild_directiveArray_withoutDirectives_test {

    @Test
    public void build_directiveArray_withoutDirectives_test() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        assertTrue(result.length == 0);
    }

}
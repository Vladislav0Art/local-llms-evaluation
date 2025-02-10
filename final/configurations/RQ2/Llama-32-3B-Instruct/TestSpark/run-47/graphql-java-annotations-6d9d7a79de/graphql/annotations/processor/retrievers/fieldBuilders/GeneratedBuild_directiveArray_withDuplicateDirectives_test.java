package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.mockito.Mockito;

public class GeneratedBuild_directiveArray_withDuplicateDirectives_test {

    @Test
    public void build_directiveArray_withDuplicateDirectives_test() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        List<GraphQLDirective> directives = new ArrayList<>();
        // mock duplicate directives list
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        assertEquals(directives.stream().map(DirectiveJavaAnnotationUtil::getDirective).toArray(GraphQLDirective[]::new), result);
    }

}
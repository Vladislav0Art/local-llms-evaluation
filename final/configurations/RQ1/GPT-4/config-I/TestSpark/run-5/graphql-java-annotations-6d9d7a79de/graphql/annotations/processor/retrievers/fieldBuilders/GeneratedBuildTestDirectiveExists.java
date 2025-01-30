package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.annotationTypes.directives.DirectiveLocations;
import graphql.annotations.annotationTypes.directives.definition.DirectiveDefinition;
import graphql.annotations.directives.DirectiveAndWiring;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedBuildTestDirectiveExists {

    @Directive(locations = DirectiveLocations.FIELD)
    public @interface TestDirective {
        String name();
    }

    @DirectiveDefinition(directive = @Directive(name = "DirectiveName", locations = DirectiveLocations.FIELD))
    public class TestClassWithDirective {
    }

    @Test
    public void buildTestDirectiveExists() throws NoSuchFieldException {
        Field field = TestClassWithDirective.class.getDeclaredField("fieldWithDirective");
        ProcessingElementsContainer containerMock = mock(ProcessingElementsContainer.class);

        Map<String, DirectiveAndWiring> registry = new HashMap<>();
        registry.put("DirectiveName", new DirectiveAndWiring(null));

        when(containerMock.getDirectiveRegistry()).thenReturn(registry);

        DirectivesBuilder builder = new DirectivesBuilder(field, containerMock);
        GraphQLDirective[] result = builder.build();

        assertEquals(1, result.length);
        assertEquals("DirectiveName", result[0].getName());
    }

}
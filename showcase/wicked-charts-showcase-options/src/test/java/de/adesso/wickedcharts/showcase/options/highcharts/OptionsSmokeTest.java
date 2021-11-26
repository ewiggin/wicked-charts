package de.adesso.wickedcharts.showcase.options.highcharts;

import de.adesso.wickedcharts.highcharts.jackson.JsonRenderer;
import de.adesso.wickedcharts.highcharts.options.Options;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Set;

class OptionsSmokeTest {

  @Test
  void testOptionsRendered() throws InstantiationException,
      IllegalAccessException, ClassNotFoundException, IOException {
    Set<Class<?>> classes = ClassFinder
        .getClasses(OptionsSmokeTest.class
            .getClassLoader(), "de.adesso.wickedcharts.showcase.options");

    JsonRenderer renderer = new JsonRenderer();

    int i = 0;
    for (Class<?> clazz : classes) {
      if (Options.class
          .isAssignableFrom(clazz) && !clazz
          .isMemberClass()) {
        Options options = (Options) clazz
            .newInstance();
        renderer
            .toJson(options);
        i++;
      }
    }
    System.out
        .println("Successfully tested Serialization of " + i
            + " option classes.");
  }
}

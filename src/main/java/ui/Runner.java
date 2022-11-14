package ui;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/main/java/ui/features/Board.feature"}, glue = {"ui/definitions"},
        plugin = {"pretty"})

public class Runner extends AbstractTestNGCucumberTests {

}
package com.maerskTestProject.BlazeDemoTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={"pretty"},
            features = "C:\\Users\\Nikolay\\Maersk\\src\\test\\resources\\Features",
            glue = "org.example.StepDefs")
    public class CucumberTestRunner {
    }


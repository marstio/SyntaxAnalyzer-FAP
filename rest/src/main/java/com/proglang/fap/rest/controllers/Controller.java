package com.proglang.fap.rest.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.proglang.fap.rest.models.SyntaxRequest;

@RestController
public class Controller {

    @PostMapping("/analyze")
    public void analyzeSyntax(@RequestBody SyntaxRequest rq) {
        ArrayList<String> lines = rq.getLines();

        for (String line : lines) {
            StringBuilder codeBlock = new StringBuilder();
            System.out.println("\nWelcome to Syntax Analyzer! Input your code below: ");
            System.out.println("(Type 'done' on a new line to finish and analyze, or 'quit' to exit the program):");

            while (true) {
                if (line.trim().equalsIgnoreCase("done")) {
                    System.out.println("\nAnalyzing the code block...\n");
                    analyzeBlock(codeBlock.toString());

                    System.out.println("\n------------- End of analysis -------------\n");
                    break;
                }
                if (line.trim().equalsIgnoreCase("quit")) {
                    System.out.println("Exiting the program...");
                    return;
                }

                codeBlock.append(line).append("\n");
            }
        }
    }

    private void analyzeBlock(String codeBlock) {
        System.out.println("Analyzing: " + codeBlock);
    }
}
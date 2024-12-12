package com.proglang.fap.rest.models;

import java.util.ArrayList;

public class SyntaxRequest {
    private ArrayList<String> lines = new ArrayList<>();

    public void setCode(String code){
        String[] codeLines = code.split("\n");

        for (int i = 0; i < codeLines.length; i++){
            lines.add(codeLines[i]);
        }
    }

    public ArrayList<String> getLines(){
        return this.lines;
    }
}
package com.example.mybatisplustest.generator.utils;


import com.example.mybatisplustest.generator.model.GenInfo;

/**
 * @author: LEIYU
 */
public class GenInfoBuilder {

    private GenInfo genInfo;

    private GenInfoBuilder() {
    }

    public static GenInfoBuilder build() {
        GenInfoBuilder instance = new GenInfoBuilder();
        instance.genInfo = new GenInfo();
        return instance;
    }
}

package com.run;

import com.Constants;
import org.apache.commons.lang3.StringUtils;
import utils.PrintModule;

public class App
{
    public static void main( String[] args ) {
        PrintModule.print(StringUtils.strip(Constants.MESSAGE));
        PrintModule.print(StringUtils.strip("   1  TEST 1   "));

    }
}

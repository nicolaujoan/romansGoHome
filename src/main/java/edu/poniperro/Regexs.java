package edu.poniperro;

import java.util.HashMap;
import java.util.Map;

public final class Regexs {
    public static final Map<String, String> regexs = new HashMap<String, String>();

    public void initRegexs() {
        regexs.put("M", "M{1,3}");
    }

    public static Map<String, String> getRegexs() {
        return regexs;
    }
}

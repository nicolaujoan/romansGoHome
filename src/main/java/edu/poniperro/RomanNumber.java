package edu.poniperro;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.*;
import java.util.stream.Collectors;

public class RomanNumber {
    private String roman;
    private Double decimal;

    public RomanNumber(String roman) {
        this.roman = roman;
    }

    public Double toDecimal() {
        String regex = getSuitableRegex(roman);

        if (itMatchs(regex)) {

        }

        return 0.0;
    }

    private Boolean itMatchs(String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(roman);
        return m.find();
    }

    private double getDecimalValue(String roman) {
        String[] strArr = roman.split("");

        for (String ch: strArr) {

        }
    }

    private static String getSuitableRegex(String roman) {
        Map<String, String> regexs = Regexs.getRegexs();
        return regexs.get(roman);
    }
}

package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> tails = new ArrayList<>(value.length());

        int i;
        for (i = 0; i < value.length() + 1; i++) {
            tails.add(value.substring(i, value.length()));
        }
        return tails;
    }

}

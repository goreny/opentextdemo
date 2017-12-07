package com.opentext.appworks;

public class StringReverserImpl implements StringReverser {

    @Override
    public String reverseStringInPlace(char[] toReverse) {
        return new String(toReverse);
    }

}

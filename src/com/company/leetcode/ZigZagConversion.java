package com.company.leetcode;

public class ZigZagConversion {
    /**
     *  The string "PLAYALISHIRING" is written in a zigzag pattern on a given number
     *  of rows like this:
     */

    public String conver(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }
        for (int i = 0; i < s.length(); i++) {
            int index = i % (2*numRows-2);
            index = index < numRows ? index : 2 * numRows -2 -index;
            sb[index].append(s.charAt(i));
        }
        for (int i = 0; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }

}

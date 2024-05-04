/*
 todo:Uncommon Words from Two Sentences
Easy

A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
 

Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 * 
 * 
 */

import java.util.*;


class UncommonWords {
    public static String[] uncommonFromSentences(String s1, String s2) {
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashMap<String, Integer> hp1 = new HashMap<>();
        HashMap<String, Integer> hp2 = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            hp1.put(arr1[i], hp1.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < n2; i++) {
            hp2.put(arr2[i], hp2.getOrDefault(arr2[i], 0) + 1);
        }

        HashSet<String> hp = new HashSet<>();
        for (var a : hp1.keySet()) {
            if (hp1.get(a) == 1) {
                if (!hp2.containsKey(a))
                    hp.add(a);
            }
        }

        for (var a : hp2.keySet()) {
            if (hp2.get(a) == 1) {
                if (!hp1.containsKey(a))
                    hp.add(a);
            }
        }

        String ans[] = new String[hp.size()];
        int idx = 0;
        for (var a : hp)
            ans[idx++] = a;
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String result[] = uncommonFromSentences(s1, s2);

        for (String s : result) {
            System.out.println(s);
        }

    }
}

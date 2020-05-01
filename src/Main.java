public class Main {

    public static void main(String[] args) {

        String x = helloName("Bob");
        System.out.println(x);

        x = makeAbba("Hi", "Bye");
        System.out.println(x);

        x = makeTags("i", "Yay");
        System.out.println(x);

        x = makeOutWord("<<>>", "Yay");
        System.out.println(x);

        x = extraEnd("hello");
        System.out.println(x);

        x = firstTwo("X");
        System.out.println(x);

        x = firstHalf("WooHoo");
        System.out.println(x);

        x = withoutEnd("Hello");
        System.out.println(x);

        x = comboString("Hello", "hi");
        System.out.println(x);

        x = nonStart("Hello", "There");
        System.out.println(x);

        x = left2("Hello");
        System.out.println(x);

        x = right2("Hello");
        System.out.println(x);

        x = theEnd("Hello", true);
        System.out.println(x);

        x = withouEnd2("Hello");
        System.out.println(x);

        x = middleTwo("string");
        System.out.println(x);

        boolean y = endsLy("y");
        System.out.println(y);

        x = nTwice("Chocolate", 1);
        System.out.println(x);

        x = twoChar("java", 3);
        System.out.println(x);

        x = middleThree("solving");
        System.out.println(x);

        y = hasBad("xbadxx");
        System.out.println(y);

        x = atFirst("hello");
        System.out.println(x);

        x = lastChars("", "");
        System.out.println(x);

        x = conCat("dog", "");
        System.out.println(x);

        x = lastTwo("coding");
        System.out.println(x);

        x = seeColor("redxx");
        System.out.println(x);

        y = frontAgain("edited");
        System.out.println(y);

        x = minCat("java", "Hello");
        System.out.println(x);

        x = extraFront("Hello");
        System.out.println(x);

        x = without2("HelloHe");
        System.out.println(x);

        x = deFront("Hello");
        System.out.println(x);

        x = withoutX("xHix");
        System.out.println(x);

        x = withoutX2("");
        System.out.println(x);
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String makeOutWord(String out, String word) {
        String first2 = out.substring(0, 2);
        String last2 = out.substring(2, 4);
        return first2 + word + last2;
    }

    public static String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            String first2 = str.substring(0, 2);
            return first2;
        }
        return str;
    }

    public static String firstHalf(String str) {
        String half = str.substring(0, str.length() / 2);
        return half;
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }

    public static String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public static String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public static String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1, str.length());
    }

    public static String withouEnd2(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }

    public static String middleTwo(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

    public static boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        }
        return false;
    }

    public static String nTwice(String str, int n) {
        String frontN = str.substring(0, n);
        String lastN = str.substring(str.length() - n, str.length());
        return frontN + lastN;
    }

    public static String twoChar(String str, int index) {
        if (index + 2 > str.length() || index < 0) {
            return str.substring(0, 2);
        }
        String result = str.substring(index, index + 2);
        return result;
    }

    public static String middleThree(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
    }

    public static boolean hasBad(String str) {
        if (str.startsWith("bad")) {
            return true;
        }
        if (str.length() >= 4) {
            if (str.substring(1, 4).equals("bad")) {
                return true;
            }
        }
        return false;
    }

    public static String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        }
        return "@@";
    }

    public static String lastChars(String a, String b) {
        String subA = "";
        String subB = "";
        if (a.length() == 0) {
            subA = "@";
        } else {
            subA = a.substring(0, 1);
        }
        if (b.length() == 0) {
            subB = "@";
        } else {
            subB = b.substring(b.length() - 1);
        }
        return subA + subB;
    }

    public static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
                return a + b.substring(1, b.length());
            }
        }
        return a + b;
    }

    public static String lastTwo(String str) {
        if (str.length() >= 2) {
            String last2 = str.substring(str.length() - 2);
            String result = "";
            for (int i = 2; i > 0; i--) {
                result += last2.substring(i - 1, i);
            }
            return str.substring(0, str.length() - 2) + result;
        }
        return str;
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    public static boolean frontAgain(String str) {
        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            if (str.startsWith(firstTwo) == str.endsWith(firstTwo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        } else if (a.length() > b.length()) {
            String subA = a.substring(a.length() - b.length());
            return subA + b;
        } else {
            String subB = b.substring(b.length() - a.length());
            return a + subB;
        }
    }

    public static String extraFront(String str) {
        if (str.length() >= 2) {
            String sub2 = str.substring(0, 2);
            return sub2 + sub2 + sub2;
        }
        return str + str + str;
    }

    public static String without2(String str) {
        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            if (str.startsWith(firstTwo) == str.endsWith(firstTwo)) {
                return str.substring(2);
            }
            return str;
        } else {
            return str;
        }
    }

    public static String deFront(String str) {
        if (str.substring(0, 1).equals("a")) {
            if (str.substring(1, 2).equals("b")) {
                return str;
            }
            return str.substring(0, 1) + str.substring(2);
        }
        if (str.substring(1, 2).equals("b")) {
            return str.substring(1);
        }
        return str.substring(2);
    }

    public static String withoutX(String str) {
        if ((str.startsWith("x") || str.endsWith("x")) && str.length() >= 2) {
            String result = "";
            if (str.startsWith("x")) {
                result = str.substring(1);
                if (str.endsWith("x")) {
                    result = str.substring(1, str.length() - 1);
                    return result;
                }
            }
            if (str.endsWith("x")) {
                result = str.substring(0, str.length() - 1);
            }
            return result;
        }
        if (str.equals("x")) {
            return "";
        }
        return str;
    }

    public static String withoutX2(String str) {
        if (str.length() >= 2) {
            if (str.charAt(0) == 'x') {
                if (str.charAt(1) == 'x') {
                    return str.substring(2);
                }
                return str.substring(1);
            }
            if (str.charAt(1) == 'x') {
                return str.substring(0, 1) + str.substring(2);
            }

            return str;
        } else if (str.length() == 1) {
            {
                if (str.charAt(0) == 'x') {
                    return "";
                }
                return str;
            }
        }
        return str;
    }



}
public class Main {

    public static void main(String[] args) {

        boolean x = cigarParty(30, false);
        System.out.println(x);

        int y = dateFashion(2, 9);
        System.out.println(y);

        x = squirrelPlay(70, false);
        System.out.println(x);

        y = caughtSpeeding(60, false);
        System.out.println(y);

        y = sortaSum(9, 4);
        System.out.println(y);

        String z = alarmClock(5, false);
        System.out.println(z);

        x = love6(1, 5);
        System.out.println(x);

        x = in1To10(11, false);
        System.out.println(x);

        x = specialEleven(23);
        System.out.println(x);

        x = more20(22);
        System.out.println(x);

        x = old35(15);
        System.out.println(x);

        x = less20(38);
        System.out.println(x);

        x = nearTen(19);
        System.out.println(x);
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars < 40) {
                return false;
            }
            return true;
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }
            return false;
        }
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            if (temp >= 60 && temp <= 100) {
                return true;
            }
            return false;
        } else {
            if (temp >= 60 && temp <= 90) {
                return true;
            }
            return false;
        }
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            }
            return 2;
        } else {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            }
            return 2;
        }
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum < 10 || sum > 20) {
            return sum;
        } else {
            return 20;
        }
    }

    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            }
            return "off";
        } else {
            if (day >= 1 && day <= 5) {
                return "7:00";
            }
            return "10:00";
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            if (n <= 1 || n >= 10) {
                return true;
            }
            return false;
        } else {
            if (n >= 1 && n <= 10) {
                return true;
            }
            return false;
        }
    }

    public static boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        }
        return false;
    }

    public static boolean more20(int n) {
        if (n % 20 == 1 || n % 20 == 2) {
            return true;
        }
        return false;
    }

    public static boolean old35(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                return false;
            }
            return true;
        }
        if (n % 5 == 0) {
            return true;
        }
        return false;
    }

    public static boolean less20(int n) {
        if (n % 20 == 18 || n % 20 == 19) {
            return true;
        }
        return false;
    }

    public static boolean nearTen(int num) {
        return (num % 10 <= 2) || (num % 10 >= 8);

    }

}

package lk.HostelManagementSystem.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class CheckValidation {
        public CheckValidation() {
        }

        public static boolean validation(ValidationType type, String value) {
            Pattern namePattern;
            Matcher matcher;
            switch (type) {
                case USERNAME:
                    namePattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9-_]{3,32}");
                    matcher = namePattern.matcher(value);
                    if (matcher.matches()) {
                        return true;
                    }

                    return false;
                case PASSWORD:
                    namePattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$");
                    matcher = namePattern.matcher(value);
                    if (matcher.matches()) {
                        return true;
                    }

                    return false;
                case DATE:
                    namePattern = Pattern.compile("[01-12]{2}\\/[01-31]{2}\\/[1-2][0-9]{3}");
                    matcher = namePattern.matcher(value);
                    if (matcher.matches()) {
                        return true;
                    }

                    return false;
                case NAME:
                    namePattern = Pattern.compile("[a-zA-Z]{2,}");
                    matcher = namePattern.matcher(value);
                    if (matcher.matches()) {
                        return true;
                    }

                    return false;
                case CONTACT:
                    namePattern = Pattern.compile("^(?:7|0|(?:\\\\+94))[0-9]{9,10}$");
                    matcher = namePattern.matcher(value);
                    if (matcher.matches()) {
                        return true;
                    }

                    return false;
                case MONEY:
                    namePattern = Pattern.compile("^(?!(?:^[-+]?[0.]+(?:[Ee]|$)))(?!(?:^-))(?:(?:[+-]?)(?=[0123456789.])(?:(?:(?:[0123456789]+)(?:(?:[.])(?:[0123456789]*))?|(?:(?:[.])(?:[0123456789]+))))(?:(?:[Ee])(?:(?:[+-]?)(?:[0123456789]+))|))$");
                    matcher = namePattern.matcher(value);
                    if (matcher.matches()) {
                        return true;
                    }

                    return false;
                case QTY:
                    namePattern = Pattern.compile("^[1-9]\\d*$");
                    matcher = namePattern.matcher(value);
                    if (matcher.matches()) {
                        return true;
                    }

                    return false;
                default:
                    return false;
            }
        }
    }

}

package horzsolt.algorithms.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285
https://www.regular-expressions.info/ip.html
 */

public class Ipv4Ipv6Validation {

    public static String isValid(String ip) {

        Pattern ip4 = Pattern.compile("^((2[0-5]\\d|[01]?\\d{0,2})\\.){3}(2[0-5]\\d|[01]?\\d{0,2})$");
        Pattern ip6 = Pattern.compile("^([\\da-f]{1,4}:){7}[\\da-f]{1,4}$");

        Matcher m4 = ip4.matcher(ip);
        Matcher m6 = ip6.matcher(ip);

        if (m4.find())
            return "4";
        else if (m6.find())
            return "6";
        else
            return "N";
    }
}


/*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        Pattern ip4 = Pattern.compile("^((2[0-5]\\d|[01]?\\d{0,2})\\.){3}(2[0-5]\\d|[01]?\\d{0,2})$");
        Pattern  ip6 = Pattern.compile("^([\\da-f]{1,4}:){7}[\\da-f]{1,4}$");
        while (count-- > 0){
            String line = sc.nextLine();
            Matcher m4 = ip4.matcher(line);
            Matcher m6 = ip6.matcher(line);
            if (m4.find())
                System.out.println("IPv4");
            else if (m6.find())
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
    }
}*/
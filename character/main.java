package character;

import java.util.Date;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        final String str = "Hello World";
        final String content = "hello world";

        // compare
        log("字符串比较");
        print(str.compareTo(content));
        print(str.compareToIgnoreCase(content));

        // find the index of anther string
        log("字符串查找");
        String world = "world";
        int index = content.indexOf(world);
        print(index);

        // delete a string in anther string
        log("字符串替换");
        int llindex = str.indexOf("ll");
        print(str.substring(0, llindex) + str.substring(llindex + 2));

        log("字符串翻转");
        String reverseStr = new StringBuffer(str).reverse().toString();
        print(reverseStr);

        log("字符串分割,以l为分隔符");
        String[] strArr = str.split("l");
        for (String v : strArr) {
            print(v);
        }

        log("大小写转换");
        print(str.toUpperCase());
        print(str.toLowerCase());

        log("字符串格式化");
        String string = "one";
        int one = 1;
        double pointInt = 2.01;
        System.out.format("%s-%d-%.2f", string,one,pointInt);
        print("\r\n");

        log("字符串连接");
        StringBuilder result = new StringBuilder();
        result.append(str);
        result.append(content);
        print(result);

    }

    private static <E> void print(E input) {
        System.out.println(input);
        System.out.println("\r\n");
    }

    private static <E> void log(E input) {
        Date date = new Date();
        System.out.println(date.toLocaleString() + " - " + input);
    }

}
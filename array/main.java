package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;


/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Integer[] arr = { 1, 5, 7, 3, 2, 6, 7, -1, -6 };
        log("原数组");
        arrayPrint(arr);
        log("排序后数组");
        Arrays.sort(arr);
        arrayPrint(arr);
        log("搜索2的位置");
        int index = Arrays.binarySearch(arr, 2);
        print(index);

        Integer newarr[] = new Integer[10];
        System.out.println("数组长度：" + arr.length);
        System.arraycopy(arr, 0, newarr, 0, arr.length);
        newarr[9] = 8;
        log("扩容后数组");
        arrayPrint(newarr);

        log("最大值");
        Integer max = Collections.max(Arrays.asList(newarr));
        System.out.println(max);

        log("最小值");
        int min = Collections.min(Arrays.asList(newarr));
        System.out.println(min);

        log("数组合并");
        List list = new ArrayList(Arrays.asList(arr));
        List list1 = new ArrayList(Arrays.asList(newarr));
        list.addAll(list1);
        arrayPrint(list.toArray());

        log("arrayList方式打印合并数组");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        log("删除数组中最后一个元素");
        list.remove(list.size()-1);
        arrayPrint(list.toArray());

        log("计算list和list1差集");
        list1.removeAll(list);
        arrayPrint(list1.toArray());
            
    }

    private static < E > void arrayPrint(E array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
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